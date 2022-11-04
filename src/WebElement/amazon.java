package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		driver.close();

	}

}
