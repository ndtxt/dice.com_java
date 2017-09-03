package com.dice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {
  
  @Test
  public void firstTestMethod(){
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    //Open dice.com
    driver.get("http://www.dice.com");
    System.out.println("Dice opened");
    
    driver.quit();
  }
  
  @Test
  public void secondTestMethod(){
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    //Open linkedin.com
    driver.get("http://www.linkedin.com");
    System.out.println("Dice opened");
    
    driver.quit();
  }
}
