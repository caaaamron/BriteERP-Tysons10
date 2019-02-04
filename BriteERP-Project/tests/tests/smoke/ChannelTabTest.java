package tests.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.GeneralUtils.ChannelTabPage;
import utilities.GeneralUtils.Constants;
import utilities.GeneralUtils.TestBase;
import utilities.PageUtils.ChannelsTabPage;
import utilities.PageUtils.DiscussPage;

public class ChannelTabTest extends TestBase{
	
	@Test
	public void clickingTest() {
		
		//Clicking the channels tab which brings itno new environment
		DiscussPage.clickChannelsTab();
		
		//Verifying clicking action brings to correct environment
		Assert.assertEquals(ChannelsTabPage.getUrl(), Constants.CHANNELTAB_ENVI);
		
		//Verifying that all channels are displayed to the user
		Assert.assertTrue(ChannelsTabPage.hasAllChannels());
	
	}
}
