package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
/*		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	
		//By using ID
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Ragul@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("1234567");
		
		
		//By Using Name
		WebElement txtUserName = driver.findElement(By.name("email"));
		txtUserName.sendKeys("kumar@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.name("Pass"));
		txtPassword.sendKeys("1234567");

		WebElement btnLogin = driver.findElement(By.name("pass"));
		btnLogin.click();*/
	/*	
		driver.get("https://www.google.com/");
		
		WebElement searchWord = driver.findElement(By.name("q"));
		searchWord.sendKeys("GreensTechnology");
		
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.click();
		
		*//*
		*
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement userId = driver.findElement(By.name("DUMMY1"));
		userId.sendKeys("Ragul");
		*/
		
		/*
		driver.get("https://netbanking.hdfcbank.com/" );
		
		WebElement User = driver.findElement(By.className("form-control text-muted"));
		User.sendKeys("Ragul");
		*/
		/*
		driver.get("https://www.swiggy.com/");
		WebElement location = driver.findElement(By.name("location"));
		location.sendKeys("Chennai");*/
		/*
		driver.get("https://www.snapdeal.com/login");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Ragul");*/
		/*
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("sri");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");*/
		
		
	}
}
