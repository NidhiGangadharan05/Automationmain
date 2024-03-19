package searchcartshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class allselenium
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bookswagon.com/");
		//driver.manage().window().maximize();
		
		//url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//title
		String getActualTitle=driver.getTitle();
		System.out.println(getActualTitle);
		
		//search
		driver.findElement(By.xpath("//*[@id=\"inputbar\"]")).sendKeys("Common yet Uncommon");
		driver.findElement(By.xpath("//*[@id=\"btnTopSearch\"]")).click();	
		
		//add to cart button
		driver.findElement(By.id("btnAddtocart")).click();
		
		//screenshot of add to cart 
		Thread.sleep(5000);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("D:\\NIDHIG\\SOFTWARE TESTING\\AUTOMATION TESTING\\screenshots\\addcart.jpg"));
		
		
	}

}
