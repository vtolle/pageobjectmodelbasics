package de.valkotolle.pages.crm.accounts;

import de.valkotolle.base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage gotoCreateAccount() {
		
		click("createaccount_CSS");
		
		return new CreateAccountPage();
	}
	
	public void gotoImportAccounts() {
		
		
	}

}
