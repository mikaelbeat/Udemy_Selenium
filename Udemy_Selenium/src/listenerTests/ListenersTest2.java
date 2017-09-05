package listenerTests;

import org.testng.annotations.Test;

import listenersPackage.CustomListener2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

@Listeners(CustomListener2.class)
public class ListenersTest2 {
	
  @BeforeClass
  public void setUp() {
	  System.out.println("Code in before class");
  }
  
  @Test
  public void testMethod1() {
	  System.out.println("Code in testMethod1");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Code in testMethod2");
	  Assert.assertTrue(false);
  }
 

  @AfterClass
  public void cleanUp() {
	  System.out.println("Code in after class");
  }

}
