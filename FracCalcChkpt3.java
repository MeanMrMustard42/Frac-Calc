import java.util.Scanner;
import java.util.*;

public class FracCalcChkpt3 {


		public static String equation; // full equation
		public static String firstNum; // first fraction
		public static String operand; // plus, minus, etc
		public static String secondNum; // second fraction
		int indexOfSecondSpace = 0;
		int indexOfOperation = 0;
		boolean ifQuit = false; // stuff we'll probably use later
		boolean on = false;
		static int num1;
		static int dom1;
		static int num2;
		static int dom2;
		static int answer;
		
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Welcome to the Fraction Calculator, v. 1.0.0.0. Enter an equation here pls: ");
			equation = sc.nextLine();
			sc.close(); 

			System.out.println(produceAnswer(equation));
		}

		public static String produceAnswer(String input) {
			Scanner console = new Scanner(input); // Parse this individual string
			firstNum = console.next();
			Integer.parseInt(firstNum);
			operand = console.next();
			secondNum = console.next();
			Integer.parseInt(secondNum);
			if(operand.equals("+")) {
				answer = firstNum+secondNum;
				
			}
			if(operand.equals("-")) {
				answer = firstNum - secondNum;
				
			}
			if(operand.equals("/")) {
				answer = firstNum / secondNum;
				
			}if(operand.equals("x")) {
				answer = firstNum x secondNum;
				
			}
			
			String answerTwoPointOh = Integer.toString(answer);
				
	        console.close();
	        // if produceAnswer() is always returning negatives, there's probably something wrong with your operator method
			return answerTwoPointOh; 

	} 
	
	
}

