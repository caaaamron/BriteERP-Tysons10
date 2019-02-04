package tests.dummy_tests;

import org.testng.annotations.Test;

import utilities.GeneralUtils.PropertyConfig;
import utilities.GeneralUtils.TestBase;
import utilities.PageUtils.DiscussPage;
import utilities.PageUtils.Homepage;
import utilities.PageUtils.OodooPage;
import utilities.PageUtils.SignInPage;

public class test1 extends TestBase {
	
	@Test
	public void test() {
		DiscussPage.addChannel("general");
	
	}
}
