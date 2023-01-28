package testPacakge;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePacakge.LoginPage;

public class ActiTimeTestValidLogin extends BaseTest {
	
	@Test
	public void validTest() throws InterruptedException, IOException 
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	}

}
