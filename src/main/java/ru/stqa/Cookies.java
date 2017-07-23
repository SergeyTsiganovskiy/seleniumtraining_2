package ru.stqa;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Cookies {
  public static void main(String[] args) {
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("unexpectedAlertBehaviour", "dismiss");
    WebDriver driver = new ChromeDriver(caps);
    driver.manage().addCookie(new Cookie("",""));
  }
}
