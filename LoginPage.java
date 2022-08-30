package testFront;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {
	final String URL = "http://localhost:4200/index/login";
	
	@Test
	public void primeiroTeste() {
		System.setProperty("webdriver.chrome.driver", "//home//felix//Documents//ChromeDriver//chromedriver");
		WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get(URL);
		driver.findElement(By.cssSelector(".login-container a")).click();
		Assert.assertFalse(driver.getCurrentUrl().equals(URL));
		driver.quit();
	}
}
