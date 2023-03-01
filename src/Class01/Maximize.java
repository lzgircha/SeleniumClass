package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers=new ChromeDriver();
        drivers.get("https://google.com");
        //maximize the window
        drivers.manage().window().maximize();
        //full screen
        drivers.manage().window().fullscreen();
        drivers.close();
    }
}
