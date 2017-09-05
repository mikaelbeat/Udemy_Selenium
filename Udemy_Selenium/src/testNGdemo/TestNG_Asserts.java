package testNGdemo;


import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Asserts {

	@BeforeClass
	public void beforeClass() {
//		driver = new ChromeDriver();
	}

	@Test
	public void testSum(){
		System.out.println("\nRunning Test -> Check sum");
		TestClasses sum = new TestClasses();
		int result = sum.sumNumbers(1,2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testString(){
		System.out.println("\nRunning Test -> Check String");
		TestClasses obj = new TestClasses();
		String expectedString = "Hello World";
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays(){
		System.out.println("\nRunning Test -> Check Arrays");
		int[] expectedArrays = {1,2,3};
		TestClasses obj = new TestClasses();
		int[] result = obj.getArray();
		Assert.assertArrayEquals(result, expectedArrays);
	}

}
