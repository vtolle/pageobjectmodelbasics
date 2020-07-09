package de.valkotolle.base;

import org.openqa.selenium.WebDriver;

import de.valkotolle.pages.crm.accounts.AccountsPage;

public class TopMenu {

	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void gotoHome() {
		
		
		
	}

	public void gotoFeeds() {
		
		
		
	}

	public void gotoLeads() {
		
		
		
	}

	public AccountsPage gotoAccounts() {
		
		Page.click("account_CSS");
		
		return new AccountsPage();
		
	}

	
	// ... alle Menue-Einträge
	
	
	public void signOut() {
		
		
		
	}


	
}
