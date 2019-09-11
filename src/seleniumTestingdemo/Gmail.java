package seleniumTestingdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\New folder\\\\selenium\\\\crome driver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F&csig=AF-SEnYNNzbY7OVhSi0I%3A1564604836&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("identifierId")).sendKeys("gokul@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		String et = "gmail";
		
		driver.close();
		
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successfull");
		}
		else
		{
		    System.out.println("Test fail");
		}
	}

}
