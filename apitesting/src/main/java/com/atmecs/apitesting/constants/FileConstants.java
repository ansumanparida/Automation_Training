package com.atmecs.apitesting.constants;

import java.io.File;

public class FileConstants {
	public static final String BASE_DIR = System.getProperty("user.dir");
	public static final String RESOURCES_DIR = BASE_DIR + File.separator + "src" + File.separator + "main" + File.separator + "resorces";
	public static final String TESTDATA_DIR = RESOURCES_DIR + File.separator + "testdata";
	
	//testdata files path
	public static final String USERS_DATA_PROP_FILE = TESTDATA_DIR + File.separator + "usersdata.properties";
}
