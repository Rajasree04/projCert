package com.edu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTest {

	WebDriver driver = new ChromeDriver();
  driver.get("http://ec2-3-17-174-56.us-east-2.compute.amazonaws.com:8081/");
  driver.findElement(By.linkText("Home")).click();
  String at=driver.getTitle();
  String et="home";
  driver.close();
  if(at.equalsIgnoreCase(et))
  {
    System.out.println("Test Successfull");
    }
   else
   {
      System.out.println("Test is not successful");
      
    }
 }
  
