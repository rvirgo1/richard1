package rvirgo1.GitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

protected WebDriver driver;
	
@Test
	public void guru99tutorial() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "d:/Program Files/Drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  String eTitle = "Guru - Hire Quality Freelancers And Find Freelance Jobs";
		  String aTitle = "";
		  //launch chrome and redirect to base url
		  driver.get("http://www.guru.com");
		  driver.manage().window().maximize();
		  aTitle = driver.getTitle();
		  System.out.println("Page Title: "+aTitle);
		  if (aTitle.equals(eTitle)) {
			  System.out.println("Test Passed");
		  } else {
			  System.out.println("Test Failed");
		  }
		  System.out.println("at last the test has ended");		  
		  Thread.sleep(3000);
		  driver.close();
	}

}
