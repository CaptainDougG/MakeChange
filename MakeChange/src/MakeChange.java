import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeChange {

	public static void main(String[] args) throws Exception{

		final double TOONIEVALUE = 2;
		final int LOONIEVALUE = 1;
		final double QUARTERVALUE = 0.25;
		final double DIMEVALUE = 0.10;
		final double NICKELVALUE = 0.05;

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("What is your dollar amount?:");

			String input = reader.readLine();
			double number = Double.parseDouble(input);
			number = NICKELVALUE*(Math.round(number/NICKELVALUE));

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

			System.out.println("toonies:" + numberOfToonies + "; loonies:" + numberOfLoonies + "; quarters:" + (int)numberOfQuarters + "; dimes:" + (int)numberOfDimes + "; nickels:" + (int)numberOfNickels);
		} catch (Exception e) {
			System.out.println("INVALID");
		}
		
	}
}

