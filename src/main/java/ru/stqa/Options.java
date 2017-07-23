package ru.stqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Options {
  public static void main(String[] args) {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-fullscreen");
//    WebDriver driver = new ChromeDriver(chromeOptions);

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
    WebDriver driver = new ChromeDriver(caps);

  }
}
