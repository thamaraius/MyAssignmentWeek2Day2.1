package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
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
			  
		     WebElement clickcreatelead = driver.findElement(By.linkText("Create Lead"));
			  
			 // WebElement clickcreatelead = driver.findElement(By.xpath("//text()='Create Lead']"));
					  	  
			  clickcreatelead.click();
			  
			  WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
			  firstname.sendKeys("Thamarai");
			  WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
			  lastname.sendKeys("Selvi");
			  WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
			  companyname.sendKeys("Spinebiz");
			  
			  WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			  Select sourcedropdown = new Select(source);
			  sourcedropdown.selectByVisibleText("Cold Call");
			  
			  WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			  Select industrydropdown = new Select(industry);
			  industrydropdown.selectByValue("IND_AEROSPACE");
			  
			  WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			  Select ownershipdropdown = new Select(ownership);
			  ownershipdropdown.selectByIndex(2);
			  
			  WebElement department = driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']"));
			  department.sendKeys("IT");
			  
			  WebElement description = driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
			  description.sendKeys("NA");
			  
			  WebElement email = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
			  email.sendKeys("thamarai.selvaraju@gmail.com");
					  
			 WebElement clickcreate = driver.findElement(By.className("smallSubmit"));
			 clickcreate.click();
			 
			 String title = driver.getTitle();
			 System.out.println(title);
			  
			  
			  		
			  //driver.close();
			 
			
			// WebDriverManager.firefoxdriver().setup(); 
			 // Open browser 
			// FirefoxDriver driver1=new FirefoxDriver(); 
			 //Load URL
			// driver1.get("http://leaftaps.com/opentaps/control/main");
			 
			// driver1.manage().window().maximize(); 
			 
			// driver1.close();
			 
			// WebDriverManager.chromedriver().setup();
				// Open browser
				//ChromeDriver driver2=new ChromeDriver();
				//Load URL
				//driver2.get("http://leaftaps.com/opentaps/control/main");
			//	driver2.manage().window().maximize();
				//driver2.close();
				
			
		 
		 }

}
