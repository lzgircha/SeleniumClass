package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDown=drivers.findElement(By.xpath("//select[@id='select-demo']"));

        Select sel=new Select(dropDown);
        //use select class we have different method to select the desired option
        //Select by index
        sel.selectByIndex(2);
        Thread.sleep(2000);

        //select by Value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);

        //select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);


    }
}
