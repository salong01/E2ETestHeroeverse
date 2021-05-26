package e2e.testing.test;

import org.testng.annotations.Test;
import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T003LogOut extends CoreTest{

	@Override
	public void startTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runTest() {
		// TODO Auto-generated method stub
		LoginPage login = new LoginPage(getDriver());
		getDriver().get("http://elmundo.es");
		wait(3000);
	}

	@Override
	public void endTest() {
		// TODO Auto-generated method stub
		
	}
	
	
}