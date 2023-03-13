package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
            WebDriver drivers = new ChromeDriver();
            drivers.manage().window().maximize();
            drivers.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        List<WebElement> checkBoxes=drivers.findElements(By.xpath("//input[@class='cb1-element']"));
    }
}
