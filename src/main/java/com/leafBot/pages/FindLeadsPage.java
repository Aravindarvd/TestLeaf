package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class FindLeadsPage extends SeleniumBase {
	public FindLeadsPage enterFirstName(String firstName) {
		clearAndType(locateElement("xpath","(//input[@name='firstName'])[3]"),firstName);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		return this;
	}
	
	public ViewLeadPage clickLeadName(String firstName) {
		click(locateElement("link",firstName));
		return new ViewLeadPage();
	}

}
