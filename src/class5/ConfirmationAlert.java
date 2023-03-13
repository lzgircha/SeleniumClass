package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        //click on the button for simple prompt alert
        drivers.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //use switch to
        Alert alert=drivers.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        //click on the prompt alert button
        drivers.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        //switch the focus to alert
        alert.sendKeys("abracadabra");
        Thread.sleep(2000);
        //accept it
        alert.accept();
        drivers.quit();
}}
