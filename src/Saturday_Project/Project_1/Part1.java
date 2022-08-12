package Saturday_Project.Project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gizem\\Selenium Tool\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");
        //driver.manage().window().maximize();
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Techno Study Group 2");



        WebElement userEmail = driver.findElement(By.id("userEmail"));
        fullName.sendKeys("info@technostudy.com");


        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        fullName.sendKeys("Techno Study 18 Ave 45 St No:4");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        fullName.sendKeys("Techno Study 18 Ave 45 St No:4");

        WebElement showMessageButton = driver.findElement(By.id("submit"));
        showMessageButton.click();

        WebElement header = driver.findElement(By.className("output"));
        String tagNameOfHeader = header.getText();

        System.out.println("Output: " + tagNameOfHeader);
    }

}
