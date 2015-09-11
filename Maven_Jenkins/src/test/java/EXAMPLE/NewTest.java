package EXAMPLE;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;       
    @Test              
    public void testEasy() {    
        driver.get("http://www.automationcode.com");  
        String title = driver.getTitle();                
        Assert.assertTrue(title.contains("Free Selenium Tutorials"));       
    }
    @Test
    public void testEasy1() {    
        driver.get("http://www.google.co.in");  
        String title = driver.getTitle();                
        Assert.assertTrue(title.contains("Googlesddv"));       
    }
    
    @BeforeTest
    public void beforeTest() {  
        driver = new FirefoxDriver();  
    }       
    @AfterTest
    public void afterTest() {
        driver.quit(); 
        System.out.println("completed testing");
    }   

}
