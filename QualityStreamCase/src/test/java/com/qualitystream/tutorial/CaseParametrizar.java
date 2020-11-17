package com.qualitystream.tutorial;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseParametrizar {

	private WebDriver driver;
	
	@Before
	public void setUp () {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
	}
	
	@Test
	public void testGooglePage() {
		

		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
    	WebElement searchbox = driver.findElement(By.cssSelector("figure.elementor-image-box-img:nth-child(1) a"));
		
//		WebElement searchbox = driver.findElement(By.cssSelector("li class.post-7550:ntc-child(1) a"));
		
//		searchbox.clear();
				
//		searchbox.sendKeys("quality-stream ¿Qué es ser Choucair?");
		
//		searchbox.submit();
		
		searchbox.click();
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		assertEquals("quality-stream quality-stream - Choucair", driver.getTitle());
	
	}
	
//    @After
//	
//	public void finalice () {
//    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
//	driver.quit();
//    }
	
}
