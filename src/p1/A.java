package p1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {

	@Test
	public void test1() {
		System.out.println("from test1");
	}
	@Test
	public void test2() {
		System.out.println("from test2");
	}
	@Before
	public void test3() {
		System.out.println("before test1");
	}
	@After
	public void test4() {
		System.out.println("After test1");
	}
	@BeforeClass
	public static void test5() {
		System.out.println("Before Class");
	}

@AfterClass
public static void test6() {
	System.out.println("After Class");
}

	
}
