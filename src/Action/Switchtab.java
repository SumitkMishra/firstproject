package Action;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtab {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[text()=\" GEARS \"]")).click();
	driver.findElement(By.xpath("(//a[text()=\" SkillRary Essay\"])[2]")).click();
	Set<String> child = driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
	}
	driver.findElement(By.id("mytext")).sendKeys("my name is SUMIT KUMAR MISHRA");
	driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
	Thread.sleep(3000);
	driver.quit();

	}

}
