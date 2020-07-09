package de.valkotolle.pages;

import org.openqa.selenium.By;

import de.valkotolle.base.Page;
import de.valkotolle.pages.crm.CRMHomePage;

public class StartPage extends Page{
	

	public void goToCalendar() {
		
		driver.findElement(By.xpath("//span[@class='_logo-calendar _logo-x96 zod-app-logo']")).click();
		
		
	}
	
	public CRMHomePage goToCRM() {
		
//		driver.findElement(By.xpath("//span[@class='_logo-crm _logo-x96 zod-app-logo']")).click();
		click("crmlink_XPATH");
	
		return new CRMHomePage();
		
	}
	
	

}
