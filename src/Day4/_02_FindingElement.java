package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        //finding element by using ID
        WebElement locateById = driver.findElement(By.id("allrecords"));

        // Finding Element by using className
        WebElement locateByClassName = driver.findElement(By.className("t181__title t-title t-title_md"));

        //Finding element by LinkedText (only for a tag elements) //
        WebElement locateByLinkedText = driver.findElement(By.linkText("SDET course"));

        //Finding element by using tagName
        WebElement locateByTagName = driver.findElement(By.tagName("a"));

        //Finding Elements by using CSS selector
        WebElement locatedByCssSelector = driver.findElement(By.cssSelector("div[class='t580__title t-title t-title_sm t-margin_auto']"));





    }
}
