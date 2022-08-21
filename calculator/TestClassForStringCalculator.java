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
//7. Number greater than 1000 should be ignnored
//8. Allow add method to handle new line(\n) character as delimeter


public class TestClassForStringCalculator {

	@Test //1
	public void testForAnEmptyString() {
		assertEquals(0,StringCalculator.add(""));
	}
    public void testForSingleValue()
    {
    	assertEquals(1,StringCalculator.add("1"));
    }
}
