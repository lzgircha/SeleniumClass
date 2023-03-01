package HWclass1and2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {
    public static void main(String[] args) {
        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form, click on register, close the browser

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
            WebDriver drivers=new ChromeDriver();
            drivers.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            drivers.manage().window().maximize();

            drivers.findElement(By.id("customer.firstName")).sendKeys("First Name");
            drivers.findElement(By.id("customer.lastName")).sendKeys("Last Name");
            drivers.findElement(By.id("customer.address.street")).sendKeys("123 Street Address");
            drivers.findElement(By.id("customer.address.city")).sendKeys("City");
            drivers.findElement(By.id("customer.address.zipCode")).sendKeys("20816");
            drivers.findElement(By.id("customer.phoneNumber")).sendKeys("202345763");
            drivers.findElement(By.id("customer.ssn")).sendKeys("29837241t16");
            drivers.findElement(By.name("customer.username")).sendKeys("FLname");
            drivers.findElement(By.name("customer.password")).sendKeys("Monday!");
            drivers.findElement(By.name("repeatedPassword")).sendKeys("Monday!");
            drivers.findElement(By.className("button")).click();
            drivers.close();
    }
}
