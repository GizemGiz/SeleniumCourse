package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _05_AactionsClass_HoverOver {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.myntra.com/");

        WebElement homeAndLiving = driver.findElement(By.xpath("//a[text()='Home & Living']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(homeAndLiving).perform();

        Thread.sleep(4000);
        WebElement bathTowels = driver.findElement(By.xpath("//a[text()='Bath Towels']"));
        bathTowels.click();

    }
}
