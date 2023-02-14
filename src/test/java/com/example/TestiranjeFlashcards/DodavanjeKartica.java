package com.example.TestiranjeFlashcards;

import java.time.Duration;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class DodavanjeKartica {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testDodavanjeKartica() throws Exception {
    driver.get("http://localhost:3000/login");
    driver.findElement(By.xpath("//input[@type='email']")).click();
    driver.findElement(By.xpath("//input[@type='email']")).clear();
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("b@a.com");
    driver.findElement(By.xpath("//input[@type='password']")).clear();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asdfasdf");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/button")));

    driver.get("http://localhost:3000/Home");

    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[8]/button")).click();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).click();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).sendKeys("Prvo pitanje.");
    driver.findElement(By.xpath("//div[@id='answer']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='answer']/textarea")).sendKeys("Prvi odgovor");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).click();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).sendKeys("Drugo pitanje");
    driver.findElement(By.xpath("//div[@id='answer']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='answer']/textarea")).sendKeys("Drugi odgovor");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).click();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='question']/textarea")).sendKeys("Treće pitanje");
    driver.findElement(By.xpath("//div[@id='answer']/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='answer']/textarea")).sendKeys("Treći odgovor");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
