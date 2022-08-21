package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCalculator{

	public static int add(String input) {
		if(isEmpty(input))
		{
			return 0;
		}
		String allNumbersArray[]=input.split(",");
		ArrayList<Integer> negativeNumbers=new ArrayList<Integer>();
		int sum=0,num=0;
		int flag=0; //for negative number found or not
		for(String number : allNumbersArray)
		{
		    num=StringToInteger(number);
		    if(num>0)
		    {
		    	sum+=num;
		    }
		    else
		    {
		        negativeNumbers.add(num);
		        flag=1; //negative number found
		    }
		}
	    try
	    {
	    	if(flag==1)
			{
				throw new NegativeNumbersException("Negative numbers are not allowed. Numbers are "+ (negativeNumbers));
			}
	    }
	    catch(NegativeNumbersException e)
	    {
	    	System.out.println(e.getMessage());
	    	return -1;
	    }
		
	    return sum;
		
	}



	private static int StringToInteger(String input) {
		int num=0;
		try {
			num=Integer.parseInt(input);
            return num;
			
		}catch(Exception e)
		{
			num=(input.charAt(0)+0)-96;
            return num;
		}
		
	}

	private static boolean isEmpty(String input) {
		if(input=="")
		{
		   return true;
		}
		return false;
	}

	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string to find sum");
	    String input=sc.next();
	    if(StringCalculator.add(input)!=-1)
	    {    
	    	System.out.println("Answer: "+StringCalculator.add(input));
	    }
	}
}
