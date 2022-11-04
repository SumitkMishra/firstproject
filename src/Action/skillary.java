package Action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class skillary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
WebElement ele=driver.findElement(By.id("cars"));
Select s=new Select(ele);
s.selectByIndex(2);
s.selectByValue("99");
System.out.println(s.isMultiple());

if(s.isMultiple()) {
	List<WebElement> sle = s.getAllSelectedOptions();
	System.out.println(sle.size());
	for(WebElement b:sle) {
		System.out.println(b.getText());
	}
}
else
{ System.out.println("fail");
}

driver.close();
	}

}
