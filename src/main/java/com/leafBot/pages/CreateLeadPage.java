package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLeadPage extends SeleniumBase {
		public CreateLeadPage enterCompName(String cname) {
			clearAndType(locateElement("id","createLeadForm_companyName"),cname);
			return this;
		}
		public CreateLeadPage enterFirstName(String fname) {
			clearAndType(locateElement("id","createLeadForm_firstName"),fname);
			return this;
		}
		
		public CreateLeadPage enterLastName(String lname) {
			clearAndType(locateElement("id","createLeadForm_lastName"),lname);
			return this;
		}
		
		public ViewLeadPage clickCreateLead() {
			click(locateElement("xpath","//input[@value=\"Create Lead\"]"));
			return new ViewLeadPage();
		}
		
}
