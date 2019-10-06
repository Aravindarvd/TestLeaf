package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.pages.MyHomePage;

public class HomePage extends SeleniumBase{
	public MyHomePage clickCRM() {
		click(locateElement("link","CRM/SFA"));
		return new MyHomePage();
	}
	public FindLeadsPage clickFindLead() {
		click(locateElement("link","Find Leads"));
		return new FindLeadsPage();
	}
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}

}
