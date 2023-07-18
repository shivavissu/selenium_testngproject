package testScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
  @Test(groups="Feature1")
  public void test14() {
	  System.out.println("This is testmethod14");
  }
  @Test(groups="Feature2")
  public void test24() {
	  System.out.println("This is testmethod24");
  }
  @Test(groups="Feature3")
  public void test34() {
	  System.out.println("This is testmethod34");
  }
  @Test(groups="Feature4")
  public void test44() {
	  System.out.println("This is testmethod44");
  }
}
