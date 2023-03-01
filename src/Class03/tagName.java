package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("https://www.amazon.com/");
        //get all the links on the tag<a> which is also called anchor tag
        //lets use the locator by tagName for this purpose
        List<WebElement> tags=drivers.findElements(By.tagName("a"));
        for(WebElement tag:tags){
            //System.out.println(tag); this will print all the web elements not the links
            //to print the links
            String link =tag.getAttribute("href");
            System.out.println(link);
        }
    }
}
