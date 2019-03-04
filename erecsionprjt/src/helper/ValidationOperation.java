package helper;

import org.testng.Assert;

abstract public class ValidationOperation {

	public static String verify(String ExpectedResult,String ActualResult)
	{
		try
		{
			Assert.assertEquals(ExpectedResult, ActualResult);
			
			return "Pass";
		}
		catch (AssertionError e) 
		{
			return "Fail";
		}
		
	}
	
	
}
