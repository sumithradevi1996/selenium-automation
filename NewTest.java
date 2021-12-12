import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
package demo;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("test");
	  Assert.assertEquals(String actual, String expected); 
  }
  

  @BeforeTest
  public void beforeTest() {
	  String actualUrl="dawaf71416@dxecig.com";
	  System.out.println("before test");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
