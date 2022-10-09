package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
		
		
		  WebDriverManager.edgedriver().setup(); 
		  // Open browser EdgeDriver driver=new
		  EdgeDriver driver=new EdgeDriver(); 
		  
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize(); 
		  
		 // WebElement username = driver.findElement(By.id("username"));
		  
		  WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		  
		  username.sendKeys("Demosalesmanager");
		  
	// WebElement password = driver.findElement(By.id("password"));
		  
		  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		  
		  password.sendKeys("crmsfa");
		  
	// WebElement login = driver.findElement(By.className("decorativeSubmit"));
		  
		  WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		  
		  login.click();
		  
		  WebElement clicklink = driver.findElement(By.xpath("//*[@id=\"button\"]/a/img"));
		  clicklink.click();
		  
		  WebElement lead = driver.findElement(By.linkText("Leads"));
		  lead.click();
		  
		  driver.findElement(By.linkText("My Leads")).click();
		  driver.findElement(By.linkText("10016")).click();
		  
		  driver.findElement(By.linkText("Edit")).click();
		  
		  WebElement update = driver.findElement(By.id("updateLeadForm_firstName"));
		  update.clear();
		  update.sendKeys("Update");
		  
		  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		  
		  WebElement findlink = driver.findElement(By.linkText("Find Leads"));
		  findlink.click();
		  

		  driver.findElement(By.name("id")).sendKeys("10016");
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  
		  
	}

}
