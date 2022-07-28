package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_GetTagName {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/");

        WebElement header = driver.findElement(By.id("site-name"));
        String tagNameOfHeader = header.getTagName();// you can learn any element's tga name using this method!

        System.out.println("Tag name: " + tagNameOfHeader);

        driver.quit();

    }
}
