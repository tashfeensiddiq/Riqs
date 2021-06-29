package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class riskdashboard {

	static WebDriver driver2= login.driver2;
	
	static By riskmodule= By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[2]/fuse-navigation/div/fuse-nav-vertical-item[3]/a/span[2]");
	static By addrisk= By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-dashboard/div/div[1]/div/div[2]/app-platform-feature-guard/div/button");
	
	
	public static void clickrisk() {
		driver2.findElement(riskmodule).click();
	}
	
	public static void addrisk() {
		driver2.findElement(addrisk).click();
	}

}
