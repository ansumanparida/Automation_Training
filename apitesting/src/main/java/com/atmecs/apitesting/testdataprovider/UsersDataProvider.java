package com.atmecs.apitesting.testdataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.apitesting.constants.FileConstants;
import com.atmecs.apitesting.utils.PropertyReader;

public class UsersDataProvider {
	@DataProvider(name = "usersdata")
	public static Object[][] getUsersData(){
		PropertyReader usersDataReader = new PropertyReader(FileConstants.USERS_DATA_PROP_FILE);
		String url = usersDataReader.get("url");
		String firstName = usersDataReader.get("firstName");
		String lastName = usersDataReader.get("lastName");
		
		Object[][] data = new Object[1][3];
		data[0][0] = url;
		data[0][1] = firstName;
		data[0][2] = lastName;
		
		return data;
		
		
	}

}
