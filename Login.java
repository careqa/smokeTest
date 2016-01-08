package com.example.tests;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class Login extends SeleneseTestNgHelper {
	@Test public void testLogin() throws Exception {
		selenium.open("/login-p1002-q50606147.html");
		selenium.click("xpath=(//input[@id='emailId'])[2]");
		selenium.type("xpath=(//input[@id='emailId'])[2]", "psubbarao+demo@care.com");
		selenium.type("xpath=(//input[@name='password'])[2]", "test1234");
		selenium.click("xpath=(//button[@type='submit'])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[@id='nav']/div[6]/div/div");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=area");
		selenium.click("css=a[name=\"&lid=Log Out&lpos=l0\"] > b");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a[name=\"&lid=Log Out&lpos=l0\"] > b");
		selenium.waitForPageToLoad("30000");
	}
}
