package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class ViewLeadPage extends SeleniumBase {
	public ViewLeadPage verifyFirstName() {
		getElementText(locateElement("id","viewLead_firstName_sp"));
		return this;
	}
	
	
	  public EditLeadPage clickEdit() {
		 click(locateElement("link","Edit"));
		 return new EditLeadPage();
	  }
	  
	  public ViewLeadPage verifyCompanyName(String newCompanyName) { 
		  String confirmNewCompany = getElementText(locateElement("id","viewLead_companyName_sp"));
		  if(confirmNewCompany.contains(newCompanyName)) 
		  { return null; 
		  } 
		  return this; 
		  }
	 

}
