package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("https://accounts.google.com/InteractiveLogin/identifier?elo=1&ifkv=AWnogHcCLpkIuDNj6CRttzIkFbWrBwrdIae9YzozHarieZNbAdTBNzChc4Lvr6wRGcb1xBBv676rtA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        drivers.findElement(By.xpath("//a[text()='Help']")).click();
        drivers.findElement(By.xpath("//a[text()='Privacy']")).click();

        String parentWindowHandle= drivers.getWindowHandle();
        System.out.println(parentWindowHandle);

        Set<String> windowHandles = drivers.getWindowHandles();
//        print all the window handles
        for(String wh:windowHandles){
            //switch the focus of the driver to help window
            drivers.switchTo().window(wh);
            //check the title of the window to which our focus is right now
            String title=drivers.getTitle();
            if(title.equalsIgnoreCase(" Privacy Policy - Privacy& Terms - Google")){
                break;
            }
        }
        //to verify we switched to the right window;
        System.out.println((drivers.getTitle()));
        drivers.switchTo().window(parentWindowHandle);
    }
}
