package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class EditLeadPage extends SeleniumBase {
	public EditLeadPage editCompanyName(String newCompanyName) {
		clearAndType(locateElement("id","updateLeadForm_companyName"),newCompanyName);
		return this;
	}
	
	public ViewLeadPage clickUpdate() {
		click(locateElement("xpath","//input[@value=\'Update\']"));
		return new ViewLeadPage();
	}

}
