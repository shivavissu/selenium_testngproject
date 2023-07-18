package parllelScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
	@Test
	  public void testOne() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestOne in SampleTwoTest" +id);
	  }
		  @Test
	  public void testTwo() {
			  long id=Thread.currentThread().getId();
			  System.out.println("TestTwo in SampleTwoTest" +id);
		  }
			  @Test
			  public void testThree() {
				  long id=Thread.currentThread().getId();
				  System.out.println("TestThree in SampleTwoTest" +id);
			  }
				  
		  @Test
				  public void testFour() {
					  long id=Thread.currentThread().getId();
					  System.out.println("TestFour in SampleTwoTest" +id);
				  }
}
