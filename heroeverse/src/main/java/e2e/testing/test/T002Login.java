package e2e.testing.test;

import org.testng.annotations.Test;
import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T002Login extends CoreTest{

	@Override
	public void startTest() {
		// TODO Auto-generated method stub
	}

	@Override
	public void runTest() {
		LoginPage login = new LoginPage(getDriver());
		getDriver().get("http://marca.com");
		wait(3000);
		//login.login("saul", "saul");
	}

	@Override
	public void endTest() {
		// TODO Auto-generated method stub
	}

	
}