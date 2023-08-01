package org.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestng {
@Test(priority = 1)
public void testcase() {
	System.out.println("This is from testcase");
	Assert.assertEquals("Actual", "Actual");
}
@Test(priority = 2)
public void othertestcase() {
	System.out.println("This is from my other testcase");
	SoftAssert sa =new SoftAssert();
	sa.assertEquals("Actual","expected");
	sa.assertAll();
}
@BeforeTest
public void beforetest() {
	System.out.println("This is a precondition");
}
@AfterTest
public void aftertest() {
	System.out.println("This is postcondition");
}
}
