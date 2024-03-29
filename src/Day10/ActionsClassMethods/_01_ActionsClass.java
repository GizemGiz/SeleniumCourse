package Day10.ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _01_ActionsClass {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver);
        actions.click(clickMeButton).perform();

        WebElement textAfterClick = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(textAfterClick.getText());

        driver.quit();
    }
}
