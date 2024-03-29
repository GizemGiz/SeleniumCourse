package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_isDisplayed {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        WebElement invisibleText = driver.findElement(By.cssSelector("#finish>h4"));

        boolean isDisplayedBeforeClick = invisibleText.isDisplayed();

        startButton.click();

        Thread.sleep(7000);

        boolean isDisplayedAfterClick = invisibleText.isDisplayed();

        System.out.println("Before Start: " + isDisplayedBeforeClick);
        System.out.println("After Start: " + isDisplayedAfterClick);

        driver.quit();
    }
}
