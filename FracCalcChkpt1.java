/* ATTN ALL WANNABE PLAGIARIZERS: This is only FracCalc Checkpoint 1, i.e. only 
 * the first part of FracCalc. I'll be uploading Checkpoints 2 and 3 when I get around to it. 
 * For now, just enjoy passing your APCS class, I know it can be an absolute bitch at times.
 */

import java.util.*;

public class FracCalcChkpt1 {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome to the Fraction Calculator, v. 1.0.0.0. Enter an equation here pls: ");
		equation = sc.nextLine();
		sc.close(); 

		System.out.println(produceAnswer(equation));
	}

	public static String produceAnswer(String userInput) {
		Scanner console = new Scanner(userInput); // Parse this individual string
		firstNum = console.next();
		// console.nextInt(); // so Eclipse console output doesn't mess itself up
		operand = console.next();
		// console.nextInt();
		secondNum = console.next();
console.close();
		return secondNum;

	}

}