package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
	
		int input = 12321;
		int original=input;
		int output=0;
		
		while(input!=0)
		{
			int digit=input%10;
			output=output*10+digit;
			input=input/10;
		}
		
		if(original==output)
		{
			System.out.println(original+" is palindrome");
		}
		else
		{
			System.out.println(original+" is not palindrome");
		}
		

	}

}
