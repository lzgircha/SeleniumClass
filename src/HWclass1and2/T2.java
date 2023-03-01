package HWclass1and2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2 {
    public static void main(String[] args) throws InterruptedException {
        //navigate to fb.com, click on create new account, fill up all the textboxes, click on sign up button
        //close the pop-up, close the browser
        //TIP for HW2:
        //just fill in text boxes or button, no need to deal with other webElements
        //also u will need a Thread.sleep after clicking on create new account (we will discuss "WHY" in future)
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers=new ChromeDriver();
        drivers.get("https://www.facebook.com/");
        drivers.manage().window().maximize();
        drivers.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);
        drivers.findElement(By.name("firstname")).sendKeys("TesterFirstName");
        drivers.findElement(By.name("lastname")).sendKeys("TesterLastName");
        drivers.findElement(By.name("reg_email__")).sendKeys("Tester@gmail.com");
        drivers.findElement(By.name("sex")).click();
        drivers.findElement(By.name("websubmit")).click();
        Thread.sleep(4000);
        drivers.quit();
        drivers.close();
    }
}
