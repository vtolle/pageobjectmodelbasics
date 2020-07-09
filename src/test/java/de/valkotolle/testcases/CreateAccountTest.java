package de.valkotolle.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import de.valkotolle.base.Page;
import de.valkotolle.pages.StartPage;
import de.valkotolle.pages.crm.accounts.AccountsPage;
import de.valkotolle.pages.crm.accounts.CreateAccountPage;
import de.valkotolle.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String,String> data) {

		StartPage sp = new StartPage();
		sp.goToCRM();

		// click im Topmenü auf Kunden(Accounts)
		AccountsPage account = Page.menu.gotoAccounts();

		CreateAccountPage cap = account.gotoCreateAccount();
		cap.createAccount(data.get("accountname"));

	}

}
