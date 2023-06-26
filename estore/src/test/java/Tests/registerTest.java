package Tests;

import org.testng.annotations.Test;

import Libraryfiles.Browserfile;
import POMClasses.Registerfunction;

public class registerTest extends Browserfile {
	

	public Registerfunction reg;
	
	@Test
	public void registertest() {
		
		test = extent.createTest("Test one is created");
		
		reg = new Registerfunction(driver);
		log.info("object for register function us created");
		test.info("object for register function us created");
		
		reg.inputmyaccount();
		log.info("click my account option succesfully");
		test.info("click my account option succesfully");
		
		reg.inputregister();
		log.info("click register option succesfully");
		test.info("click register option succesfully");
		
		reg.inputfirstname();
		log.info("firstname accept succesfully");
		test.info("firstname accept succesfully");
		
		reg.inputlastname();
		log.info("lastname accept succesfully");
		test.info("lastname accept succesfully");
		
		reg.inputemail();
		log.info("email accept succesfully");
		test.info("email accept succesfully");
		
		reg.inputphone();
		log.info("phone accept succesfully");
		test.info("phone accept succesfully");
		
		reg.inputpassword();
		log.info("password accept succesfully");
		test.info("password accept succesfully");
		
		reg.inputconpassword();
		log.info("confirm password accept succesfully");
		test.info("confirm password accept succesfully");
		
		reg.inputnewsletter();
		log.info("newsletter selected succesfully");
		test.info("newsletter selected succesfully");
		
		reg.inputprivacy();
		log.info("privacy selected  succesfully");
		test.info("privacy selected succesfully");
		
		reg.inputcontinuebutton();
		log.info("continue button clicked succesfully");
		test.info("continue button clicked succesfully");
		
	}
	

}
