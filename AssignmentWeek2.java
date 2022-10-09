package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentWeek2 {

	public static void main(String[] args) {
		
		
		//Setup browser
		
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
		  
		  driver.findElement(By.linkText("10011")).click();
		  
		  WebElement delete = driver.findElement(By.linkText("Delete"));
		  delete.click();
		  
		  
		  WebElement findlink = driver.findElement(By.linkText("Find Leads"));
		  findlink.click();
		  
			/*
			 * WebElement phonenumber =
			 * driver.findElement(By.xpath("//div[text()='Phone Number']"));
			 * phonenumber.click();
			 */
		  
		
		  
			/*
			 * WebElement leadid = driver.findElement(By.xpath("//div[text()='Lead ID']"));
			 * leadid.click();
			 */
			/*
			 * WebElement firstlead =
			 * driver.findElement(By.xpath("//*[@id=\"ext-gen871\"]")); firstlead.click();
			 */
		  
		  driver.findElement(By.name("id")).sendKeys("10006");
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			/*
			 * WebElement findby = driver.findElement(By.name("id"));
			 * findby.sendKeys("10006");
			 */
		  
		
			/*
			 * WebElement findlink1 = driver.findElement(By.linkText("Find Leads"));
			 * findlink1.click();
			 */
			/*
			 * WebElement finddeletedlead = driver.findElement(By.linkText("Find Leads"));
			 * finddeletedlead.click();
			 */
		  
		// getPageSource() to get page source
		  
		  driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']")).click();
		  
		  String t = "No records to display";
	      if ( driver.getPageSource().contains("No records to display")){
	         System.out.println("Text: " + t + " is present. ");
	      } 
	      else {
	         System.out.println("Text: " + t + " is not present. ");
	      }
		  
		  
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
