package com.dice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {
  
  @Test
  public void openDice(){
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    //Open dice.com
    driver.get("http://www.dice.com");
    System.out.println("Dice opened");
    
    driver.quit();
  }
  
  @Test
  public void openLinkedin(){
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    
    driver.get("http://www.linkedin.com");
    System.out.println("Linkedin opened");
    
    driver.quit();
  }
}
