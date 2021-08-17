package br.com.tamara;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle {
    @Test
    public void test() {



        System.setProperty("webdriver.gecko.driver","C:\\Users\\tamara.silva\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");



        WebDriver driver = new FirefoxDriver();
        driver.get("http://way2automation.com/way2auto_jquery/index.php");
        //driver.quit();

    }
}
