package Pageobjectmodule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class object {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
Actitime act=new Actitime(driver);
act.username("sumit mishra");
act.password("times");
act.login();
	}

}
