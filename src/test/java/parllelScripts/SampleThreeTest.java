package parllelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	@Test
	  public void testOne() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestOne in SampleThreeTest" +id);
	  }
		  @Test
	  public void testTwo() {
			  long id=Thread.currentThread().getId();
			  System.out.println("TestTwo in SampleThreeTest" +id);
		  }
			  @Test
			  public void testThree() {
				  long id=Thread.currentThread().getId();
				  System.out.println("TestThree in SampleThreeTest" +id);
			  }
				  
		  @Test
				  public void testFour() {
					  long id=Thread.currentThread().getId();
					  System.out.println("TestFour in SampleOneTest" +id);
				  }
}
