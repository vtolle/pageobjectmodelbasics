package de.valkotolle.pages.crm.accounts;

import de.valkotolle.base.Page;

public class CreateAccountPage extends Page{
	
	public void createAccount(String accountname) {
		
		type("accountname_CSS",accountname);
		
	}

}
