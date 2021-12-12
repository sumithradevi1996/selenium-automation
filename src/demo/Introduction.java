package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Introduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		//C:\\Users\\narayan\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\narayan\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.ranabase.com");
//		driver.findElement(By.id("j_username")).sendKeys("dawaf71416@dxecig.com");
//		driver.findElement(By.id("j_password")).sendKeys("zaq1ZAQ!");
//		driver.findElement(By.id("loginbtn")).click();
		
		//Validations Check for password
		driver.findElement(By.id("j_username")).sendKeys("dawaf71416@dxecig.com");
		driver.findElement(By.id("j_password")).sendKeys("zaq1ZAQ!");
		driver.findElement(By.id("loginbtn")).click();
		String actualUrl="https://dev.ranabase.com";
        String expectedUrl= driver.getCurrentUrl();
        
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
        
		
			
	}}
		