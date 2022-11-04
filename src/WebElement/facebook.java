package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement ele= driver.findElement(By.id("email"));
		Dimension de= ele.getSize();
		int h=de.getHeight();
		System.out.println(h+"height");
		int w=de.getWidth();
		System.out.println(w+"width");
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y=loc.getY();
		System.out.println(x+ "x cordinate");
		System.out.println(y+ "y corordinate");
		WebElement hle = driver.findElement(By.name("login"));
		if(hle.isEnabled()) {
			System.out.println("pass: button is enable");
			hle.click();}
		else {
			System.out.println("fail");
		}

	}

}
