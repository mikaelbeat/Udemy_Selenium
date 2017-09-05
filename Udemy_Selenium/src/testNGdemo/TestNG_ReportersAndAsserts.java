package testNGdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;;

public class TestNG_ReportersAndAsserts {
	
	
	
	
  @Test
  public void testStrings() {
	  String actualString = "Test Reporters And Asserts";
	  Reporter.log("The actual string is" + actualString, true);
	  Assert.assertEquals(actualString, "Test Reporters And Asserts");
	  Reporter.log("Verifying  the actual string with expected value", true);
	  Reporter.log("");
  }
  
  
  @Test
  public void testInt() {
	  int actualInt = 10;
	  Reporter.log("The actual int is " + actualInt, true);
	  Assert.assertEquals(actualInt, 10);
	  Reporter.log("Verifying the actual int with expected value", true);
	  Reporter.log("");
  }
  
 
  
  @Test
  public void testArrays() {
	  int [] actualArray = {1, 2, 3};
	  int [] expectedArray = {1, 2, 3};
	  Reporter.log("The actual array is " + actualArray, true);
	  Assert.assertEquals(actualArray, expectedArray);
	  Reporter.log("Verifying the actual array with expected value", true);
	  Reporter.log("");
  }
  
  
  
  
  
}
