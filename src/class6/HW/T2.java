package class6.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2 {
    public static void main(String[] args) {
        //Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        //2.Switch to the iframe on the page
        //3.Clear the existing text in the  editor inside the iframe
        //4.Enter the text "Hello World!" in the editor inside the iframe
        //5.Switch back to the main page
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("https://the-internet.herokuapp.com/iframe");
        WebElement frame1= drivers.findElement(By.xpath("//iframe"));
        drivers.switchTo().frame(frame1);
        WebElement textBox=drivers.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Hello World!");
        drivers.switchTo().defaultContent();
    }
}
