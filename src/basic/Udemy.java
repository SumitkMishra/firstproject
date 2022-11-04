package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Fjoin%2Flogin-popup%2F%3Flocale%3Den_US%26response_type%3Dhtml%26next%3Dhttps%253A%252F%252Fwww.udemy.com%252F");
		driver.findElement(By.id("email--1")).sendKeys("sumitkumar");
		driver.findElement(By.name("password")).sendKeys("123456");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Login | Udemy")) {
			System.out.println("pass:home page display");}
		else {
			System.out.println("fail:home page not display");
		}
		

	}

}
