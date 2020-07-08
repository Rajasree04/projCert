package com.test.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	public static void main(String arg[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2-3-15-148-238.us-east-2.compute.amazonaws.com:8082/");
		driver.findElement(By.linkText("Home")).click();
		String at = driver.getTitle();
		//System.out.println(at);
		String et = "Home";
		driver.close();
		if (at.contains(et)) {
			System.out.println("Test Successfull");
		} else {
			System.out.println("Test is not successful");

		}
	}
}
