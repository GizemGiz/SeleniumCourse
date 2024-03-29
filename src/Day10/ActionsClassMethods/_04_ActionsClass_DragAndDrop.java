package Day10.ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsClass_DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement fiveThousandButton = driver.findElement(By.xpath("(//li[@id='fourth']//a)[2]"));
        WebElement debitAmount = driver.findElement(By.id("amt7"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(fiveThousandButton, debitAmount).perform();

        WebElement bankButton = driver.findElement(By.id("credit2"));
        WebElement debitAccount = driver.findElement(By.id("bank"));

        actions.dragAndDrop(bankButton,debitAccount).perform();

        driver.quit();
    }
}
