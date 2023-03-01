package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers=new ChromeDriver();
        drivers.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        drivers.manage().window().maximize();//always do that!
        //send the username
        drivers.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
        //send the password
        drivers.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        drivers.findElement(By.className("button")).click();
    }
}
