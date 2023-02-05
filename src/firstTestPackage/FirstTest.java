package firstTestPackage;

import org.testng.Assert;
import org.openqa.selenium.*;
//import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

	public class FirstTest {
		
	 	public String baseUrl = "https://www.demo.guru99.com/V4/";
	    String driverPath = "C:\\driverall\\chromedriver.exe";
	    public WebDriver driver ;
  @Test
  public void verifyHomepageTitle() {
      
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);

      String expectedTitle = "Guru99 Bank Home Page hihi";
      String actualTitle = driver.getTitle(); 
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }

}
