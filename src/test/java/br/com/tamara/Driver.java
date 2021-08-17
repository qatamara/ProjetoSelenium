package br.com.tamara;

;import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import static org.junit.Assert.assertEquals;

public class Driver {
    @Test
    public void testPreenchendoFormularioComDadosValidos(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tamara.silva\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver navegador = new FirefoxDriver();
        navegador.get("http://way2automation.com/way2auto_jquery/index.php");
        //navegador.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        assertEquals("Welcome to the Test Site",navegador.getTitle());


        WebElement nameInput = navegador.findElement(By.name("name"));
        nameInput.sendKeys("Tamara Aquino da  Silva");
        WebElement phoneInput = navegador.findElement(By.name("phone"));
        phoneInput.sendKeys("874874878 ");
        WebElement emailInput = navegador.findElement(By.name("email"));
        emailInput.sendKeys("tamara@teste.com.br");

        WebElement comboInput = navegador.findElement(By.name("country"));
        Select coutry = new Select(comboInput);
        coutry.selectByValue("Brazil");
        WebElement cityInput = navegador.findElement(By.name("city"));
        cityInput.sendKeys("Londrina");

        WebElement usernameInput = navegador.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input"));
        usernameInput.sendKeys("tamara");

        WebElement passwordInput = navegador.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input"));
        passwordInput.sendKeys("988748782");
        passwordInput.click();
        WebElement summitButton = navegador.findElement(By.className("button"));

        navegador.findElement(By.cssSelector("div.bottom:nth-child(12) > div:nth-child(2) > input:nth-child(1)")).click();

      /*final WebDriver driver;
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      driver.get("http://way2automation.com/way2auto_jquery/index.php"); */

        // summitButton.click();











    }
}
