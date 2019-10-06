package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName="Create Lead";
		testcaseDec = "Creating a lead in Leaftaps";
		author="Aravind";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username, String password, String cname, String fname, String lname) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickCreateLead()
		.enterCompName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLead()
		.verifyFirstName();
	}

}
