package WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ele = driver.findElement(By.name("url"));
Select s=new Select(ele);
s.selectByIndex(5);
Thread.sleep(5000);
s.selectByValue("search-alias=arts-crafts-intl-ship");
Thread.sleep(5000);
s.selectByVisibleText("Beauty & Personal Care");
List<WebElement> all = s.getOptions();
System.out.println(all.size());
for(WebElement b:all) {
	System.out.println(b.getText());
}
driver.close();
}
	}


