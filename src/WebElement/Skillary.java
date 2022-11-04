package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Skillary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ele = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("Selenium Training")).click();
		WebElement plus = driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]"));

		a.doubleClick(plus).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
