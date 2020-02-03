package projlib;

import java.util.Properties;

import gtlib.Genlib;

public class Globals {

	static String filePath;
	static Properties prop;
	public static String LOGIN_URL;
	public static String TESTS_ROOT;
	public static String CONFIG_FILE_DIR;
	public static String RESULT_FILE_DIR;
	public static String DEP_FILE_DIR;
	public static String DATA_FILE_DIR;
	public static String CHROME_DRIVER_PATH;
	public static String CHROME_DATA_DIR;
	public static String IE_DRIVER_PATH;
	public static String FIREFOX_DRIVER_PATH;
	public static String SUITE_NAME;
	public static String TESTNG_FILE_NAME;
	public static String BROWSER;
	public static String SCREENSHOT_DIR;
	public static String LOG4J_FILE;
	public static String FAIL;
	public static String PASS;
	public static String EXCEPTION;
	public static String PROG_EMP_PHOTO;
	public static String PROG_EMP_DOC;
	public static String EXTENT_REPORT;
	public static String RES_NO_RUN;
	public static String RES_PASS;
	public static String RES_FAILED;
	public static String RES_EXCEPTION;
	
	
	static Properties sysMsgProp;
	//	static Properties sysMsgProp = Genlib.readConfig("E:/Project/HRMSAutomation/SystemMessages.properties");
	public static String EMP_CREATED_SUCCESS;
	public static String EMP_UPDATED_SUCCESS;
	public static String CAL_UPDATED_SUCCESS;
	public static String SAL_PROCESSED_SUCCESS;
	
	static Properties constantProp;
	//	static Properties constantProp = Genlib.readConfig("E:/Project/HRMSAutomation/Constant.properties");
	public static String TRAINEE ;
	public static String CONTRACTUAL ;
	public static String PERMANENT;

	public Globals(String path) {
		this.filePath = path;

		prop = Genlib.readConfig(filePath + "config.properties");
		LOGIN_URL = prop.getProperty("loginUrl");
		TESTS_ROOT = prop.getProperty("testsRoot");
		CONFIG_FILE_DIR = prop.getProperty("configFileDir");
		RESULT_FILE_DIR = prop.getProperty("resultFileDir");
		DEP_FILE_DIR = prop.getProperty("depFileDir");
		DATA_FILE_DIR = prop.getProperty("dataFileDir");
		CHROME_DRIVER_PATH = prop.getProperty("chromeDriver");
		IE_DRIVER_PATH = prop.getProperty("ieDriver");
		FIREFOX_DRIVER_PATH = prop.getProperty("firefoxDriver");
		SUITE_NAME = prop.getProperty("suiteName");
		TESTNG_FILE_NAME = prop.getProperty("testNGFileName");
		BROWSER = prop.getProperty("browser");
		SCREENSHOT_DIR = prop.getProperty("screenshot");
		LOG4J_FILE = prop.getProperty("log4j");
		FAIL = "F";
		PASS = "P";
		EXCEPTION = "E";
		PROG_EMP_PHOTO = prop.getProperty("empPhoto");
		PROG_EMP_DOC = prop.getProperty("empDocument");
		EXTENT_REPORT = prop.getProperty("extentReport");
		RES_NO_RUN = prop.getProperty("resNoRun");
		RES_PASS = prop.getProperty("resPass");
		RES_FAILED = prop.getProperty("resFailed");
		RES_EXCEPTION = prop.getProperty("resException");
		
		sysMsgProp = Genlib.readConfig(filePath+"SystemMessages.properties");
		EMP_CREATED_SUCCESS = sysMsgProp.getProperty("empCreatedSuccess");
		EMP_UPDATED_SUCCESS = sysMsgProp.getProperty("empUpdatedSuccess");
		CAL_UPDATED_SUCCESS = sysMsgProp.getProperty("calendarUpdatedSuccess");
		SAL_PROCESSED_SUCCESS = sysMsgProp.getProperty("salProcessedSuccess");
		
		constantProp = Genlib.readConfig(filePath+"Constant.properties");
		TRAINEE = constantProp.getProperty("trainee");
		CONTRACTUAL = constantProp.getProperty("contractual");
		PERMANENT = constantProp.getProperty("permanant");
	}




	

}
