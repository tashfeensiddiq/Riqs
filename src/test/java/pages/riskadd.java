package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class riskadd {

	static WebDriver driver2 = login.driver2;
	
	
	static By reference= By.id("mat-input-3");
	static By topic= By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-create/div/div[2]/mat-card[1]/form/div[1]/div[3]/key-value-autocomplete-field/ng-select/div/div/div[2]/input");
	static By category= By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card:nth-child(1) > form > div:nth-child(1) > div:nth-child(4) > key-value-autocomplete-field:nth-child(1) > ng-select > div > div > div.ng-placeholder");
	static By subcategory= By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card:nth-child(1) > form > div:nth-child(1) > div:nth-child(4) > key-value-autocomplete-field:nth-child(2) > ng-select > div > div > div.ng-placeholder");
	static By riskowner= By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-create/div/div[2]/mat-card[1]/form/div[1]/div[5]/app-praxis-user-autocomplete[1]/div/ng-select/div/div/div[2]/input");
	static By professional= By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card:nth-child(1) > form > div:nth-child(1) > div:nth-child(5) > app-praxis-user-autocomplete:nth-child(2) > div > ng-select > div > div > div.ng-input > input[type=text]");
	
	static By info= By.className("scrollable-content");
	
	static By addassessment= By.cssSelector("#container-3 > content > app-risk-management-create > div > div.risk-management-create.w-100-p.mb-24.mat-custom-step > mat-card.risk-management-create__card.min-h-640.mat-card > div > div > div:nth-child(2) > div");
	
	static By impact= By.className("mat-select-arrow");
	static By impactdata= By.id("mat-option-6");
	
	static By probability= By.id("mat-select-2");
	static By probabilitydata= By.id("mat-option-11");
	
	static By assessment= By.id("mat-select-3");
	static By assessmentdata= By.id("mat-option-16");
	
	static By riskvalue= By.id("mat-select-4");
	static By riskvaluedata= By.id("mat-option-19");
	
	static By action= By.id("mat-select-5");
	static By actiondata= By.id("mat-option-45");
	
	static By assessmentadd= By.cssSelector("#app-risk-management-assessment-modal > div.mt-56.h-88.border-top > button.h-40.w-180.mr-24.mat-flat-button.mat-button-base.mat-primary.ng-star-inserted");
	
	static By riskadd2= By.xpath("//*[@id=\"container-3\"]/content/app-risk-management-create/div/div[3]/button[2]");
	
	public static void setreference(String text) {
		driver2.findElement(reference).sendKeys(text);
	}
	
	public static void settopic() {
		driver2.findElement(topic).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver2.findElement(info).click();
	}

	public static void setcategory() {
		driver2.findElement(category).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver2.findElement(info).click();
	}
	
	public static void setsubcategory() {
		driver2.findElement(subcategory).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver2.findElement(info).click();
	}
	
	public static void setriskowner() {
		driver2.findElement(riskowner).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver2.findElement(info).click();
	}
	
	public static void setprofessional() {
		driver2.findElement(professional).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver2.findElement(info).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickaddassessment() {
		driver2.findElement(addassessment).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setimpact() {
		driver2.findElement(impact).click();
		driver2.findElement(impactdata).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setprobability() {
		driver2.findElement(probability).click();
		driver2.findElement(probabilitydata).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setassessment() {
		driver2.findElement(assessment).click();
		driver2.findElement(assessmentdata).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setriskvalue() {
		driver2.findElement(riskvalue).click();
		driver2.findElement(riskvaluedata).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setaction() {
		driver2.findElement(action).click();
		driver2.findElement(actiondata).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickassessmentadd() {
		driver2.findElement(assessmentadd).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickriskadd() {
	 //   Actions builder = new Actions(driver2);
	 //   Action mouseOverHome = builder.moveToElement((WebElement) riskadd2).build();
	//	mouseOverHome.perform();

	//	((JavascriptExecutor) driver2).executeScript("arguments[0].scrollIntoView();", riskadd2);
		((JavascriptExecutor) driver2).executeScript("document.querySelector('.container.ps.ps--active-y').scrollBy(0,2500)");
		driver2.findElement(riskadd2).click();
	
	}
	
	}
