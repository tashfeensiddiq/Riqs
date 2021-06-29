package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class riskupdate {

	static WebDriver driver2 = login.driver2;
	
	static By clickreferenceupdate= By.xpath("/html/body/app-root-default/fuse-main/app/vertical-layout-1/div/div/div/div/content/app-risk-management-update/div/div[2]/div/mat-card/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input");
	static By riskupdate= By.xpath("/html/body/app-root-default/fuse-main/app/vertical-layout-1/div/div/div/div/content/app-risk-management-update/div/div[2]/div/mat-card/form/div[2]/button[2]/span/span");
	
	public static void referenceupdate(String text) throws InterruptedException {
		Thread.sleep(2000);
		driver2.findElement(clickreferenceupdate).sendKeys(text);
		Thread.sleep(3000);
	}
	
	
	public static void clickriskupdate() throws InterruptedException {
	   // Actions builder2 = new Actions(driver2);
	   // Action mouseOverHome = builder2.moveToElement((WebElement) riskupdate).build();
		// mouseOverHome.perform();
		((JavascriptExecutor) driver2).executeScript("document.querySelector('.container.ps.ps--active-y').scrollBy(0,2500)");
		driver2.findElement(riskupdate).click();
		
		Thread.sleep(5000);
	}
	
}
