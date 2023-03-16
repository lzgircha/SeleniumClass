package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver drivers = new ChromeDriver();
//        max the window
        drivers.manage().window().maximize();
        drivers.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        //click on the start button
        drivers.findElement(By.xpath("//button[@='startButton']")).click();
        WebDriverWait wait = new WebDriverWait(drivers, 20);//max waited time
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        WebElement text = drivers.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText=text.getText();
        System.out.println(WelcomeText);
    }
}
