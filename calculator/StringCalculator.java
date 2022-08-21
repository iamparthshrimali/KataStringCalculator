package calculator;

public class StringCalculator {

	public static int add(String input) {
		if(isEmpty(input))
		{
			return 0;
		}
		return (StringToInteger(input));
	}

	private static int StringToInteger(String input) {
		return Integer.parseInt(input);
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
		System.out.println("Answer: "+StringCalculator.add("2,3"));
	}
}
