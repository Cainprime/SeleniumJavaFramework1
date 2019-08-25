package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test
	@Parameters({"MyName"})
	public void test1(@Optional("Raghav") String name) {
		System.out.println("I am inside test 1");
		System.out.println("Name is :"+name);
	}

	@Test
	@Parameters({"MyName"})
	public void test2(@Optional("Raghav") String name) {
		System.out.println("I am inside test 2");
	}

	@Test
	@Parameters({"MyName"})
	public void test3(@Optional("Raghav") String name) {
		System.out.println("I am inside test 3");
	}
}
