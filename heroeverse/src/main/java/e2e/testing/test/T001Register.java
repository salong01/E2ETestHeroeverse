package e2e.testing.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import e2e.testing.core.CoreTest;
import e2e.testing.pages.RegisterPage;

public class T001Register extends CoreTest{


	@Override
	public void startTest() {
		// TODO Auto-generated method stub
	}

	@Override
	public void runTest() {
		RegisterPage register = new RegisterPage(getDriver());
//		Assert.assertTrue(false);
//		getDriver().get("http://google.com");
//		wait(3000);
		
		register.register("saul", "saul.alonso.glez@gmail.com", "saul", "saul");
		
	}
	
	@Override
	public void endTest() {
		// TODO Auto-generated method stub
	}
}