package demo;

import org.openqa.selenium.By;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("j_username")).sendKeys("dawaf71416@dxecig.com");
		driver.findElement(By.id("j_password")).sendKeys("zaq1ZAQ!");
		driver.findElement(By.id("loginbtn")).click();
		String actualUrl="https://dev.ranabase.com";

	}

}
