package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {


	public static WebDriver driver2 = null;
	
	By mail= By.name("email");
	By password= By.name("password");
	By loginbutton= By.xpath("/html/body/app-root-default/fuse-main/app/vertical-layout-1/div/div/div/div/content/app-login-center/div/app-platform-feature-guard/app-platform-login-center/div/div/div/div/form/button");
	
	
	public void login_page(String text) {
		WebDriverManager.chromedriver().setup();
		driver2 = new ChromeDriver();
		driver2.get(text);
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void setEmail(String text) {
		driver2.findElement(mail).sendKeys(text);
	}

	public void setPassword(String text) {
		driver2.findElement(password).sendKeys(text);
	}
	
	public void clickLogin() {
		driver2.findElement(loginbutton).click();
	}

}
