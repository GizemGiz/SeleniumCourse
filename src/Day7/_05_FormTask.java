package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _05_FormTask {

    // ---    TASK    ---
    // Navigate https://www.facebook.com/
    // Click on Create New Account button
    // Fill the form
    // Get text for Sign Up button

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        /// WebElement creataAccountButton = driver.findElement();
        // creataAccountButton.click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameInput.sendKeys("Giz");






    }

}
