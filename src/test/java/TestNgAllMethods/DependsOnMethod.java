package TestNgAllMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(priority=1)
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods="login")
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods="login")
	void logout() {
		Assert.assertTrue(true);
	}
}
