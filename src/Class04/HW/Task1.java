package Class04.HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        drivers.manage().window().maximize();
    }
}
