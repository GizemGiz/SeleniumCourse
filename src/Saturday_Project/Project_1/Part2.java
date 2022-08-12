package Saturday_Project.Project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/%22");
//driver.manage().window().maximize();
        WebElement loginName = driver.findElement(By.id("userName"));
        loginName.sendKeys("ttechno@gmail.com");

        WebElement passwordLogin = driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Techno123");

        WebElement header = driver.findElement(By.id("log-in"));
        String tagNameOfHeader = header.getText();
        System.out.println(tagNameOfHeader);
        String strUrl = driver.getCurrentUrl();
        System.out.println(strUrl);



    }
}
