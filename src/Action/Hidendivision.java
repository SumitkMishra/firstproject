package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidendivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()=\"DEPARTURE\"]")).click();
		driver.findElement(By.xpath("(//p[text()=\"15\"])[1]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
