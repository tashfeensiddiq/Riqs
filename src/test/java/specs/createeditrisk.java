package specs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createeditrisk {

	public static void main(String[]args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://praxismonitor.seliselocal.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("kawsar.ahmed@selise.ch");
	driver.findElement(By.name("password")).sendKeys("1qazZAQ!");
	driver.findElement(By.xpath("/html/body/app-root-default/fuse-main/app/vertical-layout-1/div/div/div/div/content/app-login-center/div/app-platform-feature-guard/app-platform-login-center/div/div/div/div/form/button")).click();
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	/*
	driver.switchTo().activeElement();
	
	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-library-tutorial/div/div[2]/div[2]/button[1]/span")).click();
	
	*/
	
	driver.findElement(By.xpath("//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[2]/fuse-navigation/div/fuse-nav-vertical-item[3]/a/span[2]")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"container-2\"]/fuse-toolbar/mat-toolbar/div/div[1]/div[2]/button")).click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-dashboard/div/div[1]/div/div[2]/app-platform-feature-guard/div/button")).click();
	
	//reference
	driver.findElement(By.id("mat-input-3")).sendKeys("Test 1");
	
	//topic
	driver.findElement(By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-create/div/div[2]/mat-card[1]/form/div[1]/div[3]/key-value-autocomplete-field/ng-select/div/div/div[2]/input")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.className("scrollable-content")).click();
	
	//category
	driver.findElement(By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card:nth-child(1) > form > div:nth-child(1) > div:nth-child(4) > key-value-autocomplete-field:nth-child(1) > ng-select > div > div > div.ng-placeholder")).click();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.className("scrollable-content")).click();
	
	
	//subcategory
	driver.findElement(By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card:nth-child(1) > form > div:nth-child(1) > div:nth-child(4) > key-value-autocomplete-field:nth-child(2) > ng-select > div > div > div.ng-placeholder")).click();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.className("scrollable-content")).click();
	
	//riskowner
	driver.findElement(By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-create/div/div[2]/mat-card[1]/form/div[1]/div[5]/app-praxis-user-autocomplete[1]/div/ng-select/div/div/div[2]/input")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.className("scrollable-content")).click();
	
	
	//professional
	driver.findElement(By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card:nth-child(1) > form > div:nth-child(1) > div:nth-child(5) > app-praxis-user-autocomplete:nth-child(2) > div > ng-select > div > div > div.ng-input > input[type=text]")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.className("scrollable-content")).click();
	
	//addassessment
	driver.findElement(By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card.risk-management-create__card.min-h-640.mat-card > div > div > div:nth-child(2) > div")).click();
	
	driver.switchTo().activeElement();
	
	driver.findElement(By.className("mat-select-arrow")).click();
	driver.findElement(By.id("mat-option-6")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("mat-select-2")).click();
	driver.findElement(By.id("mat-option-11")).click();

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("mat-select-3")).click();
	driver.findElement(By.id("mat-option-16")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("mat-select-4")).click();
	driver.findElement(By.id("mat-option-19")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("mat-select-5")).click();
	driver.findElement(By.id("mat-option-45")).click();
	
	driver.findElement(By.cssSelector("#app-risk-management-assessment-modal > div.mt-56.h-88.border-top > button.h-40.w-180.mr-24.mat-flat-button.mat-button-base.mat-primary.ng-star-inserted")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//driver.findElement(By.cssSelector("#container-3 > content > app-risk-management-create > div > div.mb-24.full-width > button.h-40.w-180.mat-raised-button.mat-button-base.mat-primary")).click();

    WebElement link_Home = driver.findElement(By.cssSelector("#container-3 > content > app-risk-management-create > div > div.mb-24.full-width > button.h-40.w-180.mat-raised-button.mat-button-base.mat-primary"));
    
     
    Actions builder = new Actions(driver);
    Action mouseOverHome = builder.moveToElement(link_Home).build();
	mouseOverHome.perform();
    
	link_Home.click();
    
	try {
		Thread.sleep(12000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-details/div/div[2]/div[1]/div[1]/div[2]")).click();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/app-platform-feature-guard[2]/div[1]/button[1]/span[1]/span[1]")).click();
	
	try {
		Thread.sleep(12000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("/html/body/app-root-default/fuse-main/app/vertical-layout-1/div/div/div/div/content/app-risk-management-update/div/div[2]/div/mat-card/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).click();
	driver.findElement(By.xpath("/html/body/app-root-default/fuse-main/app/vertical-layout-1/div/div/div/div/content/app-risk-management-update/div/div[2]/div/mat-card/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(" 2");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement link_Home2= driver.findElement(By.xpath("/html/body/app-root-default/fuse-main/app/vertical-layout-1/div/div/div/div/content/app-risk-management-update/div/div[2]/div/mat-card/form/div[2]/button[2]/span/span"));

	Actions builder2 = new Actions(driver);
    Action mouseOverHome2 = builder.moveToElement(link_Home2).build();
	mouseOverHome2.perform();
    
	link_Home2.click();
	
	try {
		Thread.sleep(12000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-details/div/div[2]/div[1]/div[1]/div[2]")).click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();

	driver.switchTo().activeElement();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//span[contains(text(),' Yes ')]")).click();
	
	//driver.close();
	
	}
}