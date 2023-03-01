package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect to webdriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers=new ChromeDriver();
        drivers.get("https://google.com");

        Thread.sleep(1000);
        //now navigate to Facebook
        drivers.navigate().to("https://www.facebook.com/");

        Thread.sleep(1000);
        //go back
        drivers.navigate().back();

        Thread.sleep(1000);
        //go to facebook
        drivers.navigate().forward();

        drivers.navigate().refresh();
        // close the browser
        drivers.close();
    }
}
