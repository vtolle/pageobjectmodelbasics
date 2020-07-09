package de.valkotolle.testcases;

import org.testng.annotations.AfterSuite;

import de.valkotolle.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}
