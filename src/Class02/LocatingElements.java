package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers=new ChromeDriver();
        drivers.get("https://facebook.com");

        drivers.findElement(By.id("email")).sendKeys("Larisa");
        drivers.findElement(By.id("pass")).sendKeys("lalalala");
       // drivers.findElement(By.linkText("Create new account")).click();
        drivers.findElement(By.partialLinkText("password?")).click();
        drivers.quit();

    }

}
