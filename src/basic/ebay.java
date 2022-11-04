package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebay {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	WebElement dropdown=driver.findElement(By.id("gh-cat"));
	 Select s=new Select(dropdown);
	 s.selectByIndex(13);
	 s.selectByValue("2984");
	 s.selectByVisibleText("Dolls & Bears");

	}

}
