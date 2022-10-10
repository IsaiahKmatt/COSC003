    import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		//variables
		double score1, score2, score3, average;
				
		//create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter score 1: ");
		score1 = keyboard.nextDouble();
		System.out.println("Enter score 2: ");
		score2 = keyboard.nextDouble();
		System.out.println("Enter score 3: ");
		score3 = keyboard.nextDouble();
		//Calculate and display the average score
		average = (score1+score2+score3)/3;
		System.out.printf("The average is %.2f \n", average);
		//If the average is higher than 95,
		//congratulate the user
	    if (average >95) 
		   System.out.println("Great job!"); 
	
	    else 
	    	 System.out.println("Good job!"); 
	}

}

    