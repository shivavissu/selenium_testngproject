package parllelScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void testOne() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TestOne in SampleOneTest" +id);
  }
	  @Test
  public void testTwo() {
		  long id=Thread.currentThread().getId();
		  System.out.println("TestTwo in SampleOneTest" +id);
	  }
		  @Test
		  public void testThree() {
			  long id=Thread.currentThread().getId();
			  System.out.println("TestThree in SampleOneTest" +id);
		  }
			  
	  @Test(invocationCount=6,threadPoolSize=3,timeOut=2000)
			  public void testFour() {
				  long id=Thread.currentThread().getId();
				  System.out.println("TestFour in SampleOneTest" +id);
			  }
	  
		   }
  
