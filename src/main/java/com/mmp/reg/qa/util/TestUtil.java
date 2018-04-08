package com.mmp.reg.qa.util;

import com.mmp.reg.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long Page_Load_Timeout = 20;
	public static long Implicit_Wait = 10;

	public void switchToFrame() {
		driver.switchTo().frame("myframe");
	}
	
	
}
