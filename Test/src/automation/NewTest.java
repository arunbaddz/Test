package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("check Indaia");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Vino");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Anil");
  
  }

}
