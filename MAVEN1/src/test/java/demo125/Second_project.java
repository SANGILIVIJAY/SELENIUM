package demo125;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_project {
	public static String vijay ="https://demo.guru99.com/test/newtours/";
	WebDriver driver;	 
	@BeforeTest
	public void jaws() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to(vijay);
		 //driver.get(vijay);
	}
	@Test(enabled = true, priority = 0)
	public void jaws1() throws InterruptedException{
			
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("user");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("user");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
	    driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
			Thread.sleep(2000);
	}
			
			@Test(enabled = true, priority = 2)
			public void jaws2() throws InterruptedException{
			    driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("eren");
				driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("yager");
	            driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("851651515154");
	            driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("naruto98@gmail.com");
	            driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hinata@gmail.com");
	            driver.findElement(By.xpath("//*[@name='password']")).sendKeys("thalapathy14");
	            driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("thalapathy");
	             driver.findElement(By.xpath("//*[@name='submit']")).click();
				Thread.sleep(2000);
			    		
			}
			@Test(enabled = true, priority = 1)
			public void jaws3() throws InterruptedException{
			  
				/*driver.findElement(By.xpath("//*[@name='address']")).sendKeys("4545,ramen hola street");
				driver.findElement(By.name("city'")).sendKeys("chennai");
	            driver.findElement(By.name("state")).sendKeys("Tamilnadu");
	            driver.findElement(By.name("postalCode")).sendKeys("652455");*/
	            Select s=new Select(driver.findElement(By.name("country")));
	            //s.selectByValue("Austria");
	            s.selectByIndex(0);
	           // s.selectByVisibleText("Argentina");
			}
	            
	           
			@AfterTest(enabled = true)
			public void AT() throws InterruptedException{
				String  title = driver.getTitle();
	            String curl= driver.getCurrentUrl();
	            System.out.println("name of the title is " +title);
	            System.out.println("name of the url is " +curl);
				driver.close();	
			}
	

}
