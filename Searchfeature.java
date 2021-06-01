package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Searchfeature {
	
	
				@Test
	
			
			public void SearchProduct() {
				
					WebDriver driver = Base.getdriver();
					driver.get("http://automationpractice.com/index.php");
					driver.findElement(By.id("search_query_top")).sendKeys("printed Dress");
					driver.findElement(By.name("submit_search")).click();
					
					int Total_number  = driver.findElements(By.xpath("//img[@itemprop='image']")).size();
					
					 
					
					Assert.assertEquals(5, Total_number);
					
					System.out.println("test @@@@ passed");
					//driver .quit();
				
				
				
			}

}
