package testLayer;

import org.testng.annotations.Test;

import testBase.TestBase;

public class HomePageTest extends TestBase{
	
	
	@Test
	public void verify_user_able_to_enter() {
		
		home.enter_name();
		home.enter_email();
		
	}

}
