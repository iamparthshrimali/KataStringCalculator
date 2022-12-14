package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

//Test cases for add method
//1. Return 0 for an empty string provided
//2. Return that value if single value is provided
//3. Return sum of 2 number in string seperated with comma
//4. Return sum of any amount of number provided in string seperated by comma
//5. Alphabet should be handled (a=1,b=2,c=3,....,z=26)
//6. For negative numbers in string throws an error and also print that number
//7. Number greater than 1000 should be ignored
//8. Allow add method to handle new line(\n) character as delimeter


public class TestClassForStringCalculator {

	@Test //1
	public void testForAnEmptyString() {
		assertEquals(0,StringCalculator.add(""));
	}
	@Test //2
    public void testForSingleValue()
    {
    	assertEquals(2,StringCalculator.add("2"));
    }
	
	@Test //3
	public void testForDoubleValues()
	{
		assertEquals(5,StringCalculator.add("2,3"));
	}
	@Test //4
	public void testForAnyAmountOfNumbers()
	{
		assertEquals(8,StringCalculator.add("1,4,3"));
	}
	@Test //5
    public void alphabetsAllowedWithNumbers()
    {
    	assertEquals(7,StringCalculator.add("1,a,b,3"));
    }
	
	@Test //6	
	public void NegativeHandledAndPrinted()
	{
		assertEquals(-1,StringCalculator.add("1,2,-3.-4,5,6"));
	}
	
    
   @Test //7
   public void multiDelimeterSupported()
   {
	    assertEquals(5,StringCalculator.add("1,2\1,5"));
   }
   
}
