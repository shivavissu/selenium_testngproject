package testScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups="Feature1")
  public void test13() {
	  System.out.println("This is testmethod13");
  }
  @Test(groups="Feature2")
  public void test23() {
	  System.out.println("This is testmethod23");
  }
  @Test(groups="Feature3")
  public void test33() {
	  System.out.println("This is testmethod33");
  }
  @Test(groups="Feature4")
  public void test43() {
	  System.out.println("This is testmethod43");
  }
}
