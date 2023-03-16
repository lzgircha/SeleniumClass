package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tableSimple {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac64/chromedriver");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //Task1: GET THE WHOLE TABLE ACCESSED AND PRINT OUT
        // table based access
        WebElement table = drivers.findElement(By.xpath("//table[@id='customers"));
        String table_data = table.getText();
        System.out.println(table_data);

        //Task2: get all the rows
        // row level access
        //get the rows of table and print them
        //modifications: print the row that contains Company google
        List<WebElement> Rows = drivers.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : Rows) {
            //extract text from each row
            String row_text = row.getText();
            if (row_text.contains("Google")) {
                System.out.println(row_text);
            }
        }
        // column level access
        List<WebElement> columns = drivers.findElements(By.xpath("///table[@id='customers']/tbody/tr/td"));
        for (WebElement column : columns) {
            System.out.println(column.getText());
        }

    }
}
