package Test;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindByID  {
	
	@Test
	
				    public void  IDFinder() {
					
					System.setProperty("webdriver.chrome.driver", "D:\\Eclips Bench\\Demo_Automation\\Driver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					
				
					 driver.get("http://automationpractice.com/index.php");
					 driver.manage().window().maximize();
					 driver.findElement(By.className("login")).click();
				     driver.findElement(By.id("email")).sendKeys("username@blah.com")	;
				     driver.findElement(By.id("passwd")).sendKeys("1234")	;
				     driver.findElement(By.id("SubmitLogin")).click();
				     driver.navigate().back();
				     driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
				     driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
				     driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
				     driver.navigate().back();
				     
				     
				     WebElement ele = driver.findElement(By.xpath("//*[@id=\\\"block_top_menu\\\"]/ul/li[1]/a"));
				     Actions action = new Actions(driver);
     			     action.moveToElement(ele).perform();
				      driver.close();
				     
							     
				     
				     System.out.println("@@@@@@@@@@@@@@@ JUNIT PASSED @@@@@@@@");
				     
				     
				   
				     
				     
		
				    }

}
