package Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextmenu {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[3]"));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
