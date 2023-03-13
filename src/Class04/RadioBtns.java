package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //click on the radio button Male
        WebElement maleBtn= drivers.findElement(By.cssSelector("input[value='Male']"));
        //maleBtn.click();

        //check if the radio button male enabled
        boolean isEnableMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnableMale);

        //check if the radio button is Displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button is displayed "+ isDisplayedMale);

        //check if the radio button is Selected
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("the male button is selected "+isSelectedMale);

        //if the radio button is not selected click on it
        if(!isSelectedMale){
            maleBtn.click();
        }

        //check if the radio button is selected after the click
        isSelectedMale=maleBtn.isSelected();
        System.out.println("the male button is selected "+isSelectedMale);
    }
}
