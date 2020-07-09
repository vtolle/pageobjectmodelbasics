package de.valkotolle.rough;

import java.util.Hashtable;

import de.valkotolle.base.Page;
import de.valkotolle.pages.HomePage;
import de.valkotolle.pages.LoginPage;
import de.valkotolle.pages.StartPage;
import de.valkotolle.pages.crm.accounts.AccountsPage;
import de.valkotolle.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {

		// This is my rough package
		HomePage home = new HomePage();
		
		LoginPage login = home.goToLogin();
		StartPage sp = login.doLogin("vtolle@puppetmail.de", "vtvtvtvt");
		sp.goToCRM();
		
		// click im Topmenü auf Kunden(Accounts) 
		AccountsPage account = Page.menu.gotoAccounts();
		
		CreateAccountPage cap = account.gotoCreateAccount();
		cap.createAccount("vtolle");

	}

}
