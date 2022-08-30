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
	final String URL = "https://portalead.sp.senai.br/";
	
	@Test
	public void primeiroTeste() {
		System.setProperty("webdriver.chrome.driver", "//home//felix//Documents//ChromeDriver//chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get(URL);
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		//Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;
		//Click the link which opens in a new window
		driver.findElement(By.cssSelector(".senai a")).click();

		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		//Wait for the new tab to finish loading content
		Assert.assertFalse(driver.getCurrentUrl().equals(URL));
		driver.quit();
	}
	@Test
	public void segundoTeste() {
		System.setProperty("webdriver.chrome.driver", "//home//felix//Documents//ChromeDriver//chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get(URL);
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		//Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;
		//Click the link which opens in a new window
		driver.findElement(By.cssSelector("#nav :nth-child(2) a")).click();

		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		//Wait for the new tab to finish loading content
		Assert.assertFalse(driver.getCurrentUrl().equals(URL));
		driver.quit();
	}
	@Test
	public void primeiroTest() {
		System.setProperty("webdriver.chrome.driver", "//home//felix//Documents//ChromeDriver//chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get(URL);
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		//Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;
		//Click the link which opens in a new window
		driver.findElement(By.id("MainContent_DestaquesHome_rptDescricao_lnk_1")).click();

		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		//Wait for the new tab to finish loading content
		Assert.assertFalse(driver.getCurrentUrl().equals(URL));
		driver.quit();
	}
}
