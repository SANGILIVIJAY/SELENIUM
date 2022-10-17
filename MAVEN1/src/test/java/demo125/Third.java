package demo125;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Third {
		public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver;
		@BeforeTest
		public void beforetest() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
		  //System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get(url);
			Thread.sleep(5000);
		}
			//String beforelogin = driver.getTitle();
			//System.out.println("name of the title before login is " +beforelogin);
			@Test(enabled=true,priority = 0)
			public void testcase1() throws InterruptedException
			{
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(5000);
			}
		
			@Test(enabled=true,priority = 1)
			public void testcase2() throws InterruptedException
			{
		     	driver.findElement(By.xpath("//*[text()='Maintenance']")).click();
		     	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		        Thread.sleep(3000);
		    	driver.findElement(By.xpath("//*[@type='submit']")).click();
		        Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
				Thread.sleep(3000);
			}
				
			@AfterTest
		    public void aftertest() throws InterruptedException
				{
				driver.close();
			
				
			}	
		  }







