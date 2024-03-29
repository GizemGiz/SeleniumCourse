package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_GetNotPresentElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        //no such element exception because the element is not present in the website yet!
        // when you het noSuchElement -> 1. check your locator
        //                               2. you might need wait
        WebElement textElement = driver.findElement(By.cssSelector("#finish>h4"));
        String text = textElement.getText();
        System.out.println(text);

        driver.quit();


    }
}
