package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static WebDriver driver = null;
    private App app = new App();
    public void TesteAdicao(){
       Assertions.assertEquals(2,app.adicao(1,1));
   }

   @Test
    public void TesteNavegarUrl(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       Assertions.assertEquals("https://www.google.com/", driver.getCurrentUrl());
       driver.close();

   }
}
