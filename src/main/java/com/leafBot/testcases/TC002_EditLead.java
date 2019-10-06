package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_EditLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
		testcaseName="Edit Lead";
		testcaseDec = "Editing a lead in Leaftaps";
		author="Aravind";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username, String password, String newCompanyName, String fname) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fname)
		.clickFindLeads()
		.clickLeadName(fname)
		.clickEdit()
		.editCompanyName(newCompanyName)
		.clickUpdate()
		.verifyCompanyName(newCompanyName);
		
	}

}
