package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //  find the username, will return us web element
        WebElement username = drivers.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");
        //find the password field
        WebElement password=drivers.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");

        //clear the username text box using method clear()
        username.clear();
        password.clear();
        //to get the text username which
        WebElement usernameText= drivers.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());


    }
}
