package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagMe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers=new ChromeDriver();
        drivers.get("https://amazon.com");
        drivers.manage().window().maximize();
        //print all the links in the amazon.com
        drivers.findElements(By.tagName("a"));

        // to be
    }
}
