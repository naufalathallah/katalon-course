
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


 /**
	 * Refresh browser
	 */ 
def static "common.Utilities.refreshBrowser"() {
    (new common.Utilities()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "common.Utilities.clickElement"(
    	TestObject to	) {
    (new common.Utilities()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "common.Utilities.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new common.Utilities()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

 /**
	 * Login to heroku form auth
	 * @param to uname and password
	 */ 
def static "herokuapp.User.Login"(
    	String uname	
     , 	String password	) {
    (new herokuapp.User()).Login(
        	uname
         , 	password)
}
