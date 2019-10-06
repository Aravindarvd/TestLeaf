package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyLeadsPage extends SeleniumBase {
	public CreateLeadPage clickCreateLead() {
		click(locateElement("link","Create Lead"));
		return new CreateLeadPage();
	}
	public FindLeadsPage clickFindLead() {
		click(locateElement("link","Find Leads"));
		return new FindLeadsPage();
	}

}
