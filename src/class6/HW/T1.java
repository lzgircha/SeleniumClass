package class6.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class T1 {
    public static void main(String[] args) {
        //1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
        //2.Click on the "Start" button to initiate the loading of a hidden element
        //3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
        //4.Click the "Finish" button to reveal the hidden element
        //5.Verify that the text "Hello World!" is now displayed on the page
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();

        drivers.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        drivers.findElement(By.xpath("//button")).click();
        drivers.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
