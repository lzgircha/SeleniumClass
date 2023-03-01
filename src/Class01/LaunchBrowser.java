package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
;
public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //tell you project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");

        //create an instance of webdriver
        WebDriver drivers=new ChromeDriver();
        drivers.get("https://www.facebook.com/");

        //get the current URL that is there in the browser
        String URL = drivers.getCurrentUrl();
        System.out.println(URL);

        //get the title of the web page
        String title = drivers.getTitle(); //Facebook - log in or sign up
        System.out.println("The title of the page is "+title);

        //give some time to see the browser, slow down for 3 sec=3000 millis
        Thread.sleep(3000);

        //close the browser
        drivers.quit();


    }
}