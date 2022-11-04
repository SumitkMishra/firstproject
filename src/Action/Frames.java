package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.skillrary.com/core-java-for-selenium-training");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("//a[@class=\"close_cookies\"]")).click();
 driver.switchTo().frame(0);
 Thread.sleep(2000);
 driver.findElement(By.xpath("//div[@class=\"play-icon\"]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//div[@class=\"pause-icon\"]")).click();

	}

}
