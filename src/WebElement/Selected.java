package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement selected = driver.findElement(By.name("remember"));
		if(selected.isSelected()) {
			System.out.println("it is selected");
		}
		else {
			System.out.println("is not selected");
		}

	}

}
