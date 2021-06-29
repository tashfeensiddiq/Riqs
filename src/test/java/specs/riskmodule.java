package specs;

import org.openqa.selenium.WebDriver;

import pages.login;
import pages.riskadd;
import pages.riskdashboard;
import pages.riskdetails;
import pages.riskupdate;

public class riskmodule {
	
	public static void main(String[]args) throws InterruptedException {
		riskcreate();
		riskupdate();
		riskdelete();
	}

	static WebDriver driver2;
	
	public static void riskcreate() {
		// TODO Auto-generated method stub
		login log = new login();
		
		log.login_page("http://praxismonitor.seliselocal.com/");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.setEmail("kawsar.ahmed@selise.ch");
		log.setPassword("1qazZAQ!");
		log.clickLogin();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		riskdashboard riskdash = new riskdashboard();
		
		riskdash.clickrisk();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		riskdash.addrisk();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		riskadd riskadd = new riskadd();
		
		riskadd.setreference("Test 1");
		riskadd.settopic();
		riskadd.setcategory();
		riskadd.setsubcategory();
		riskadd.setriskowner();
		riskadd.setprofessional();
		
		riskadd.clickaddassessment();
		
		riskadd.setimpact();
		riskadd.setprobability();
		riskadd.setassessment();
		riskadd.setriskvalue();
		riskadd.setaction();
		
		riskadd.clickassessmentadd();
		
		riskadd.clickriskadd();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void riskupdate() throws InterruptedException {
		
		riskdetails riskd = new riskdetails();
		
		riskd.clickdropdown();
		riskd.selectupdate();
		
		
		riskupdate risku = new riskupdate();
		
		risku.referenceupdate(" updated");
		risku.clickriskupdate();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void riskdelete() 
		{
			riskdetails riskd = new riskdetails();
			riskd.clickdropdown();
			riskd.selectdelete();
			
			try {
			Thread.sleep(5000);
			

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
			
			driver2.close();
			}
	
}
