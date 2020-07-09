package de.valkotolle.pages;

import de.valkotolle.base.Page;

public class LoginPage extends Page{
	


	public StartPage doLogin(String username, String password) {
		
		type("email_CSS",username);
		click("nextbtn_CSS");
		
		type("password_CSS",password);
		click("nextbtn_CSS");
		
		return new StartPage();
		
	}
	
	public void goToRegistering() {
		
		
	}
	
	public void goToLostPassword() {
		
		
	}
}
