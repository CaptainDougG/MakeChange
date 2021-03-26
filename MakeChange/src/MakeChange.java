import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeChange {

	public static void main(String[] args) throws Exception{

		final double TOONIEVALUE = 2;
		final int LOONIEVALUE = 1;
		final double QUARTERVALUE = 0.25;
		final double DIMEVALUE = 0.10;
		final double NICKELVALUE = 0.05;
		double number = 0;
		boolean works = false;


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your dollar amount?:");
		try {

			String input = reader.readLine();
			number = Double.parseDouble(input);
			works = true;

		} catch (Exception e) {
			System.out.println("INVALID");
		}
		
		
		if (works) {

			number = NICKELVALUE*(Math.round(number/NICKELVALUE));

			int numberOfToonies = (int)number / (int)TOONIEVALUE;
			double remainder = (number % TOONIEVALUE);

			int numberOfLoonies = (int)remainder / (int)LOONIEVALUE;
			remainder = (remainder % LOONIEVALUE);

			double numberOfQuarters = remainder / QUARTERVALUE;
			remainder = (remainder % QUARTERVALUE);

			double numberOfDimes = remainder / DIMEVALUE;
			remainder = (remainder % DIMEVALUE);

			double numberOfNickels = remainder / NICKELVALUE;
			remainder = (remainder % NICKELVALUE);

			System.out.println("toonies:" + numberOfToonies + "; loonies:" + numberOfLoonies + "; quarters:" + (int)numberOfQuarters + "; dimes:" + (int)numberOfDimes + "; nickels:" + (int)numberOfNickels);
		}

	}
}

