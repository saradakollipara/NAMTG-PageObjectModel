package com.mmp.reg.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mmp.reg.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\sarada\\SeleniumJAVATraining\\Eclipse Workspace\\ManageMyPatientTest\\"
					                                    + "src\\main\\java\\com\\mmp\\reg\\qa\\cofig\\config.properties");
			//FileInputStream ip = new FileInputStream(("user.dir")+"//src//main//resources//config.properties");
			
			prop.load(ip);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e ) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("CH")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));		
		
	}
	
	
}
