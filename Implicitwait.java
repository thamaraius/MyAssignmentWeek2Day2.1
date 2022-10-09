package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {

	public static void main(String[] args) {
		
		// chrome setup
		
		WebDriverManager.chromedriver().setup();
		
		//open browser
		
		ChromeDriver driver=new ChromeDriver();
		
		//load url
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement creataccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		creataccount.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Thamarai");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Selvi");
		
		WebElement entermobilenumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		entermobilenumber.sendKeys("9999999999");
		
		WebElement enternewpassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		enternewpassword.sendKeys("qwerty");
		
		WebElement date = driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[1]"));
		Select birthdate=new Select(date);
		birthdate.selectByVisibleText("2");
		
		WebElement month = driver.findElement(By.xpath("(//a[contains(@id,'u_0_0_uJ')"));
		Select birthmonth=new Select(month);
		birthmonth.selectByIndex(2);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select birthyear=new Select(year);
		birthyear.selectByValue("2018");
		
		WebElement selectgender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		selectgender.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
