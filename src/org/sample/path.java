package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class path {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@type='text']"));
		txtUserName.sendKeys("Ragul");
		
		WebElement userPassword = driver.findElement(By.xpath("//input[@type='password']"));
		userPassword.sendKeys("12345");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value=1]"));
		btnLogin.click();
		
		//position
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreate.click();
		
		
		
		List<WebElement> buttons = driver.findElements(By.xpath("(//a[@role='button'])"));
		WebElement btnCreate1 = buttons.get(1);
		btnCreate1.click();
		
		
		driver.get("http://www.greenstechnologys.com ");
		String Title = driver.findElement(By.xpath("//span[@class='blue_text']/u")).getText();
		System.out.println(Title);
		
		
		
		driver.get("https://greenstech.in/selenium-course-content.html");
		String para = driver.findElement(By.xpath("(//div[@class='col-lg-7']/p)[3]")).getText();
		System.out.println(para);
	}
}
