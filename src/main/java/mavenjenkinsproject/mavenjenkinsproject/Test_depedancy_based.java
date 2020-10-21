package mavenjenkinsproject.mavenjenkinsproject;

import org.testng.annotations.Test;

public class Test_depedancy_based {
	
	

	   @Test
	   public void testPrintMessage() {
	      System.out.println("Inside test testPrintMessage()");
	     
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      
	   }

	   @Test
	   public void initEnvironmentTest() {
	      System.out.println("This is initEnvironmentTest");
	   }


}
