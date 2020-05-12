package automation;
import java.util.ArrayList;
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
	
	
	public void login(String url)
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Prakash-Sonawane\\Downloads\\SetUp\\chromedriver_win32 (1)\\chromedriver.exe");

					ChromeOptions opt = new ChromeOptions();

					opt.addArguments("--disable-notifications");

					WebDriver driver = new ChromeDriver();

					driver.manage().window().maximize();

					driver.manage().deleteAllCookies();
					
					
					driver.get(url);
					
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					driver.findElement(By.name("uid")).clear();
					driver.findElement(By.name("uid")).sendKeys("12345");
					driver.findElement(By.name("password")).clear();
					driver.findElement(By.name("password")).sendKeys("aaaa");
					//driver.findElement(By.xpath("//*[@id=\"submitInput\"]/div[6]/input")).click();
					driver.findElement(By.xpath("//*[@id=\"submitInput\"]/div[6]/input")).click();
					String atitle =driver.getTitle();
					
					System.out.println(atitle);
					
					String etitle ="GMillennia - Login Page";
					
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



	
	public static void main(String[] args)

	{
		 Seldemo obj =new Seldemo();
		
		 obj.login("https://gmilsqm.uschecomrnd.net/web/index.jsp?timeout=true");
		
        // obj.logincredential("prakashsonawane95@gmail.com", "Prakash@29");
		
}
}
