package TestNgAllMethods;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	void testTitle() {
		
		String exp_title = "opencart";
		String act_title = "openshop";
		
		/*if(exp_title.equals(act_title)) {
			System.out.println("Test is pass");
		}
		else {
			System.out.println("test is fail");
		}
		*/
		
		System.out.println("testing...");
		
		
		//Assert.assertEquals(exp_title, act_title);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(exp_title, act_title);
		
		System.out.println("testing....");
		sa.assertAll();
	}
}
