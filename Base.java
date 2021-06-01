package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
			
		public static  WebDriver  getdriver() {
				
				System.setProperty("webdriver.chrome.driver", "D:\\Eclips Bench\\Demo_Automation\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("httP://WWW.GOOGLE.COM");
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//driver.close();
				return driver;
				
			}
			
			
			
}
