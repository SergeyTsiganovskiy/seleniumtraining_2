package ru.stqa;

import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {
  public static void main(String[] args) {
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("unexpectedAlertBehaviour", "dismiss");
    WebDriver driver = new ChromeDriver(caps);
    System.out.println(((HasCapabilities) driver).getCapabilities());
  }
}
