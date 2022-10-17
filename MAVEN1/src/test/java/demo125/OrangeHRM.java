package demo125;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
public static String vijay = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
public static String url = "https://www.youtube.com/";
WebDriver driver;	 
	@BeforeTest
	public void jaws() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to(vijay);
		 //driver.get(vijay);
	}
	@Test(enabled = false)
	public void jaws1() throws InterruptedException{
		Thread.sleep(2000);

		WebElement username =findElement(By.name("username"));
		username.sendKeys("Admin");
	}
		private WebElement findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}
		@Test(enabled = false)
		public void jaws2() throws InterruptedException{
		//ADMIN
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(4).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(4).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(4).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger ora		ngehrm-button-margin']")).click();
		System.out.println("logout from page");
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		
		}
		@Test(enabled = false)
		public void jaws3() throws InterruptedException{
		//LOGIN
		WebElement username =driver.findElement(By.xpath("//*[@placeholder='Username']"));
		if(username.isEnabled())
		username. sendKeys("Admin"); 
		 Thread.sleep(3000);
		if(username.isDisplayed())
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
	    WebElement click=driver.findElement(By.xpath("//*[@type='submit']"));
	    click.click();
		Thread.sleep(2000);
		}
		@Test(enabled =false)
		public void jaws4() throws InterruptedException{
		//ADMIN USER 
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("vijay");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		//PIM
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		driver.findElement(By.linkText("Job Titles")).click();
		Thread.sleep(2000);
		}
		@Test(enabled = true)
		public void jaws5() throws InterruptedException{
		String beforelogin=driver.getTitle();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		}
		/*driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click(); 
		Thread.sleep(4000);
		//Actions:
		//1.Keyboard Actions 
		//2.Mouse over Actions 
		//3.Scroll up or down 
		Actions act = new Actions (driver);
		WebElement ele=driver.findElement(By.xpath("//*([@class='oxd-select-text-input']"));
	    act.click(ele).build().perform();
		act.sendKeys(ele).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ENTER).click().build().perform();
		Thread.sleep(3000);
		
		String afterlogin=driver.getTitle();
		if(beforelogin.equals(afterlogin)) {
			System.out.println("logout from page");
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			
		}
		else {
			System.out.println("title is not same");
		}
		
	}*/
		@Test(enabled = true)
		public void jaws6() throws InterruptedException{
		
		//WINDOW HANDLING
		driver.getWindowHandle();
		//OPENS A NEW TAB AND SWITCHes TO NEW TAB
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//NAV TO NEW TAB AND OPENS A NEW LINK
		driver.navigate().to(url);
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

