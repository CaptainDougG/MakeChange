import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeChange {

	public static void main(String[] args) throws Exception{
		
		double TOONIEVALUE = 2;
		int LOONIEVALUE = 1;
		double QUARTERVALUE = 0.25;
		double DIMEVALUE = 0.10;
		double NICKELVALUE = 0.05;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a dollar amount");
		 
		String input = reader.readLine();
		double number = Double.parseDouble(input);
		
		int numberOfToonies = (int)number / (int)TOONIEVALUE;
		double remander = (number % TOONIEVALUE);
		
		int numberOfLoonies = (int)remander / (int)LOONIEVALUE;
		remander = (remander % LOONIEVALUE);
		
		double numberOfQuarters = remander / QUARTERVALUE;
		remander = (remander % QUARTERVALUE);
		
		double numberOfDimes = remander / DIMEVALUE;
		remander = (remander % DIMEVALUE);
		
		double numberOfNickels = remander / NICKELVALUE;
		remander = (remander % NICKELVALUE);
		
		System.out.printf("toonies:" + numberOfToonies + "; loonies:" + numberOfLoonies + "; quarters:" + numberOfQuarters + "; dimes:1; nickels:1");
	}
}

