package main;
import java.util.Scanner;

public class Converter {

	public int menuSelection = 0;
//	public static int userSelection = -1;
//	public static int userValue = 1;
	public String option1 = "1) Cups to Teaspoons";
	public String option2 = "2) Miles to Kilometers";
	public String option3 = "3) US Gallons to Imperial Gallons";
	public String option4 = "4) Break time all zones";
	public String option5 = "5) Quit";
	
	public static void main(String[] args) {
		Converter e = new Converter();
		Scanner scan = new Scanner(System.in);
		while(e.menuSelection != 5) {
			System.out.println("Please select a conversion option or quit:"  + "\n" + e.option1 + 
					"\n" + e.option2 + "\n" + e.option3 + "\n" + e.option4 + "\n" + e.option5);
			int userSelection = scan.nextInt();
			e.menuSelection = userSelection;
			if (userSelection == 5) continue;
			System.out.println("How many units?");
			double userValue = scan.nextDouble();
			
//			e.menuSelection = Converter.userSelection;
			calculation(userSelection, userValue);
		}
		scan.close();
	}
	
	public static double calculation (int userSelection, double userValue ) {
		switch(userSelection) {
			case 1:
				userValue = userValue * 48;
				System.out.println("You have " + userValue + " teaspoons");
				return userValue;
			case 2: 
				userValue = userValue * 1.6;
				System.out.println("You have " + userValue + " kilometers");
				return userValue;
			case 3:
				userValue = userValue * .83;
				System.out.println("You have " + userValue + " Imperial Gallons");
				return userValue;
			case 4:
				userValue = userValue * 1000;
				System.out.println("Break time ends at " + userValue);
				return userValue;
			default: return userValue;
				
		}
	}
}
