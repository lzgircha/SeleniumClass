package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtns2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //find all the age group radio buttons
        //the xpath here is common to all the webElements that have age group
       List<WebElement>radioBtns=drivers.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement radioBtn: radioBtns){
            String age= radioBtn.getAttribute("value");
            if(age.equalsIgnoreCase("0 - 5")){
                radioBtn.click();
            }
        }
    }
}
