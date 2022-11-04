package Action;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		driver.findElement(By.xpath("//button[text()=\" Add to Cart\"]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.close();

	}

}
