package calculator;

public class StringCalculator{

	public static int add(String input) {
		if(isEmpty(input))
		{
			return 0;
		}
		
		int sum=sum(input);
	    return sum;
		
	}

	private static int sum(String input) {
		// TODO Auto-generated method stub
		String allNumbersArray[]=input.split(",");
		int sum=0,num=0;
		for(String number : allNumbersArray)
		{
		    num=StringToInteger(number);
			sum+=num;
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
		System.out.println("Answer: "+StringCalculator.add("1,2,3,a,b,c"));
	}
}
