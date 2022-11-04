package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	 WebElement search = driver.findElement(By.name("q"));
	 if(search.isDisplayed()) {
		 System.out.println("pass:search is displaying");
		 search.sendKeys("java");
	 }
	 else {
		 System.out.println("fail");
	 }
	 Thread.sleep(2000);
	 driver.close();

	}

}
