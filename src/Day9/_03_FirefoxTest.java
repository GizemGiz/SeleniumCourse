package Day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _03_FirefoxTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\gizem\\OneDrive\\Masaüstü\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://techno.study/");
    }
}
