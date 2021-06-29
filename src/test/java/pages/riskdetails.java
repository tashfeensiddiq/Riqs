package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class riskdetails {

	static WebDriver driver2 = login.driver2;
	
	static By dropdown= By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-details/div/div[2]/div[1]/div[1]/div[2]");
	static By update= By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/app-platform-feature-guard[2]/div[1]/button[1]/span[1]/span[1]");
	
	//delete
	static By deletebutton= By.xpath("//span[contains(text(),'Delete')]");
	static By yesmodal= By.xpath("//span[contains(text(),' Yes ')]");

	
	public static void clickdropdown() {
		driver2.findElement(dropdown).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void selectupdate() {
		driver2.findElement(update).click();
	}

	public static void selectdelete() {
		driver2.findElement(deletebutton).click();
		
		driver2.switchTo().activeElement();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver2.findElement(By.xpath("//span[contains(text(),' Yes ')]")).click();
	}
	
}
