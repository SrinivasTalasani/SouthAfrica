package TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import BASECLASS.BASECLASS;
import BASECLASS.Logout;



public class OpenBrowser extends BASECLASS{
	@Test
	public void Open() throws IOException, InterruptedException{
		BASECLASS.OpenBrowser();
		
		
	}
 @AfterMethod
 public void close(){
	 Logout.logout();

}
}