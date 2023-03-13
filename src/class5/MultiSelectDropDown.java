package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement DD =drivers.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel= new Select(DD);
        //select by value
        sel.selectByValue("New Jersey");
        //select by visible text
        sel.selectByVisibleText("Ohio");

        //when it comes to MultiSelect Drop down we can also deselect
        Thread.sleep(2000);
        sel.deselectByValue("New Jersey");
        sel.deselectByVisibleText("Ohio");
        Thread.sleep(2000);
        System.out.println("The drop Down is Multiple; "+sel.isMultiple());
        drivers.quit();


    }}
