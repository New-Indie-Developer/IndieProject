package org.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {
	public static void main(String[] args) {
		WebDriver  driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		
		search.sendKeys("Pixel");
		
		search.sendKeys(Keys.RETURN);
		
		String NumberOfElements = driver.findElement(By.xpath("//span[@class='BUOuZu']")).getText();
		
		String[] Number = NumberOfElements.split(" ");
		
		List<String> searchList = new ArrayList<>(Arrays.asList(Number));
		 
		System.out.println("Total Search Result " + searchList.get(5));
		 
		System.out.println("Total Found in Page " + searchList.get(3));
		
		WebElement Items =  driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
		
		
		for (int i = 0; i <= Items.length(); i++) {
            System.out.println(Items.charAt(i));
        }
		
		
		
	}

}
