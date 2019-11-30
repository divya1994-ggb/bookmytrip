package introduction;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bms {
	public static void main(String[] args) {
		int i=0;
		int index=0;
		String scurr="";
		String snext="";
		
		File file = new File("C:\\Users\\Divya Singh\\Downloads\\geckodriver-v0.9.0-win64");
		  System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		  WebDriver driver = new FirefoxDriver();      
		
		
		
		
		//System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\Divya Singh\\\\Downloads\\\\geckodriver-v0.9.0-win64");
      
		driver.get("https://in.bookmyshow.com/pune");
		driver.findElement(By.xpath("//a[@href='/pune/movies']")).click();
		driver.findElement(By.xpath("//a(@id='now-showing-btn']")).click();
		driver.findElement(By.linkText("Frozen 2")).click();
		driver.findElement(By.linkText("BookTickets")).click();
		driver.findElement(By.linkText("3D")).click();
		driver.findElement(By.xpath("//div[@class=showtime-pill-wrapper )/class[4]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//ul[@id='popQty']/id[1]")).click();
		int count=driver.findElements(By.xpath("//div[@class=__block']")).size();
		for(i=0; i<count-1;i++)
		{
			scurr=driver.findElements(By.xpath("//div[@class=__block']")).get(i).getAttribute("color");
		snext=driver.findElements(By.xpath("//div[@class=__block']")).get(i+1).getAttribute("color");
			if(scurr.contains("FFFFFF")&&snext.contains("FFFFFF"))
			{
			index=i;
			driver.findElements(By.xpath("//div[@class=__block']")).get(i).click();
			}
			else
			{
			index=0;
			}
}
		
	}
}
