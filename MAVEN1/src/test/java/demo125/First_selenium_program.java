package demo125;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_selenium_program {
	public static String vijay = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test
	public void jaws() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
			driver.get(vijay);
			Thread.sleep(5000);
			String beforelogin=driver.getTitle();
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(5000);
			String afterlogin=driver.getTitle();
			if(beforelogin.equals(afterlogin)) {
				driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
				Thread.sleep(5000);
			}
			else {
				System.out.print("title of the page is not same");
					
			}
			
		
	}
	

}
