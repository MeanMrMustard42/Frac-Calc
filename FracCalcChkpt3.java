import java.util.*;

public class FracCalcChkpt3 {


		public static String equation; // full equation
		public static String numerator; // first fraction
		public static String operand; // plus, minus, etc
		public static String denominator; // second fraction
		int indexOfSecondSpace = 0;
		int indexOfOperation = 0;
		boolean ifQuit = false; // stuff we'll probably use later
		boolean on = false;
		static String secondNumerator;
		static String secondDenominator;
	//	static int answer;
		static int numAnswer;
		static int domAnswer;
		
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Welcome to the Fraction Calculator, v. 1.0.0.0. Enter an equation here pls: ");
			equation = sc.nextLine();
			sc.close(); 
	//TODO: Find a way to get the answers recieved from Addition(), Subtraction(), etc and get them returned in produceAnswer().		
			System.out.println(produceAnswer(equation));
		}

		public static String produceAnswer(String input) {
			Scanner console = new Scanner(input); // Parse this individual string.. lol idk if this'll work
			numerator = console.next();
			//Integer.parseInt(numerator);
			denominator = console.next();			
			//operand = console.next();
			secondNumerator = console.next();
			secondDenominator = console.next();
			//Integer.parseInt(denominator);
			if(operand.equals("+")) {
            Addition(numerator, operand, denominator, secondNumerator, secondDenominator);				
			}
			if(operand.equals("-")) {
				Subtraction(numerator, operand, denominator, secondNumerator, secondDenominator);
				
			}
			if(operand.equals("x")) {
Multiplication(numerator, operand, denominator, secondNumerator, secondDenominator);				
			}if(operand.equals("x")) {
Division(numerator, operand, denominator, secondNumerator, secondDenominator);				
			}
			
		//	String answerTwoPointOh = Integer.toString(answer);
				
	        console.close();
			//return answerTwoPointOh; 

	}

		private static void Division(String num1, String op1, String dom1, String num0, String dom0) {
			int intNum = Integer.parseInt(num1);
			int intDom = Integer.parseInt(dom1);
			int intNum2 = Integer.parseInt(num0);
			int intDom2 = Integer.parseInt(dom0);
			int tempInt;
			
			
			tempInt = intNum2; // temp value is equal to numerator
			intNum2 = intDom2; // numerator is equal to denominator
			intDom2 = tempInt; // denominator is equal to tempInt, which has the old numerator value
		
		   num0 = Integer.toString(intNum2);
		   dom0 = Integer.toString(intDom2);
			
			Multiplication(num1, op1, dom1, num0, dom0); // multiplying by the reciprocal
			
			
			
			
			

			
		}

		private static String Multiplication(String num, String op, String dom, String num2, String dom2 ) {
			int intNum = Integer.parseInt(num);
			int intDom = Integer.parseInt(dom);
			int intNum2 = Integer.parseInt(num2);
			int intDom2 = Integer.parseInt(dom2);
			
		numAnswer = intNum * intNum2;
		domAnswer = intDom * intDom2;
		String ans = Integer.toString(numAnswer) + Integer.toString(domAnswer);
		return ans;

			
		}

		private static void Subtraction(String num, String op, String dom, String num2, String dom2) {
			int intNum = Integer.parseInt(num);
			int intDom = Integer.parseInt(dom);
			int intNum2 = Integer.parseInt(num2);
			int intDom2 = Integer.parseInt(dom2);
			
			
			

			
		}
		private static void Addition(String num, String op, String dom, String num2, String dom2) {
			int intNum = Integer.parseInt(num);
			int intDom = Integer.parseInt(dom);
			int intNum2 = Integer.parseInt(num2);
			int intDom2 = Integer.parseInt(dom2);


			
		} 

	
}


