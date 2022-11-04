package Action;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notificationpopup {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()=\"Upload Resume\"]")).click();
		driver.switchTo().alert();
		driver.findElement(By.id("file-upload")).click();
		Runtime.getRuntime().exec("C:\\Users\\SUMIT\\OneDrive\\Desktop\\fileupload.au4.exe");

	}

}
