package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("https://facebook.com");
        //we create WebElement, so we can reuse it in the future
       WebElement createNewBtn=drivers.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
       createNewBtn.click();
       //put asleep statement so that the browser can open up the window which contains the element
        Thread.sleep(2000);
       WebElement firstName=drivers.findElement(By.cssSelector("input[name='firstname']"));
       firstName.sendKeys("Tester");
    }
}
