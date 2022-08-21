package calculator;

public class StringCalculator {

	public static int add(String string) {
		if(string.isEmpty())
		{
			return 0;
		}
		return (Integer.parseInt(string));
	}

	public static void main(String args[])
	{
		System.out.println("Answer: "+StringCalculator.add("2,3"));
	}
}
