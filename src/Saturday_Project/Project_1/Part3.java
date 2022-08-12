package Saturday_Project.Project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        WebElement searchBar = driver.findElement(By.id("inputValEnter"));
        searchBar.sendKeys("teddy bear");

        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='submitSearchForm('go_header']"));
        getTotalButton.click();




    }
}