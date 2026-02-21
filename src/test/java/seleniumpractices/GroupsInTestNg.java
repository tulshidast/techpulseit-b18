package seleniumpractices;

import org.testng.annotations.Test;

public class GroupsInTestNg {

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("Test 1 executed");
	}

	@Test(groups = { "smoke" })
	public void test2() {
		System.out.println("Test 2 executed");
	}

	@Test(groups = { "regression" }, enabled = false)
	public void test3() {
		System.out.println("Test 3 executed");
	}

	@Test(groups = { "smallchecks" }, enabled = false)
	public void test4() {
		System.out.println("Test 4 executed");
	}

	@Test(groups = { "sanity", "smoke" })
	public void test5() {
		System.out.println("Test 5 executed");
	}

}
