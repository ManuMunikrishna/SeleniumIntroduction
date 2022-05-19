package selenuium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/res/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/res/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
//		driver.quit();
	}

}
