package ru.stqa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class AdminLoginTest {

  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

  @Test
  public void testAdminLogin() {
    driver.navigate().to("http://localhost/litecart/public_html/admin");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();

  }

  @After
  public void tearDown() {
    driver.quit();
  }

}
