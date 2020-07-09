package de.valkotolle.pages;

import de.valkotolle.base.Page;

public class HomePage extends Page{
	
	public void goToSupport() {
		
		click("support_CSS");
		
	}
	
	public void goToSignUp() {
		
		click("signup_CSS");
		
	}
	
	public LoginPage goToLogin() {
		
		click("loginlink_CSS");
		
		return new LoginPage();
		
	}
	
	public void goToZohoEdu() {
		
	}
	
	public void goToLearnMore() {
		
	}
	
	public void validateFooterLinks() {
		
	}

}
