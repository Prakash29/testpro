package automation;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Verify;

import net.bytebuddy.implementation.bind.ArgumentTypeResolver;

public class Seldemo {
	
	WebDriver driver;
	
	public void login(String url)
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Prakash-Sonawane\\Downloads\\SetUp\\chromedriver_win32\\chromedriver.exe");

					ChromeOptions opt = new ChromeOptions();

					opt.addArguments("--disable-notifications");

					WebDriver driver = new ChromeDriver();

					driver.manage().window().maximize();

					driver.manage().deleteAllCookies();
					
					
					driver.get(url);
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
					driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("prakashsonawane95@gmail.com");
					
					driver.findElement(By.xpath("//input[@id=\"pass\"]")).clear();
					driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Prakash@29");
					
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
					
					String atitle =driver.getTitle();
					
					System.out.println(atitle);
					
					String etitle ="Facebook – log in or sign up";
					
					if(atitle.contentEquals(etitle))
					{
						System.out.println("test passed ");
					}
					else 
					{
						System.out.println("test failed");
					
					}
					String url1=driver.getCurrentUrl();
					System.out.println(url1);
					 
					
				}
		
		       
				
			catch (Exception e) 
			{
System.out.println("unable to lounch:"+e.getMessage());				
			}
		}


public void logout()
{
	driver.findElement(By.xpath("//*[@id=\"jsc_c_79\"]/div/div/span")).click();
	driver.close();
}
 public static void main(String[] args)

	{
		 Seldemo obj =new Seldemo();
		
		 obj.login("https://www.facebook.com/");
		
        // obj.logincredential("prakashsonawane95@gmail.com", "Prakash@29");
		
}
}
