//Nicholas Borromeo
//Simple Calculator Reloaded

package borromeo.simplecaculator;

import java.io.*;

public class SimpleCaculator {

	public static void main(String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader(new FileReader("calc.in"));

		while (stdin.ready()) {

			String input;
			input = stdin.readLine();

			String[] tokens = input.split(" ");

			int num1 = Integer.parseInt(tokens[0]);
			char sign = tokens[1].charAt(0);
			int num2 = Integer.parseInt(tokens[2]);

			int calculate = 0;

			if (sign == '%' && num2 == 0)
				System.out.println("Divide by Zero Error!");

			else if (sign == '/' && num2 == 0)
				System.out.println("Divide by Zero Error!");
			else {

				calculate = calculator(num1, num2, sign);
				display(num1, num2, calculate, sign);
			}

		}// end of while
	}

	public static int calculator(int num1, int num2, char operator) {

		int answer = 0;
		switch (operator) {

		case '+':
			answer = num1 + num2;
			// return sum;
			break;

		case '-':
			answer = num1 - num2;
			// return diff;
			break;

		case '*':
			answer = num1 * num2;
			// return prod;
			break;

		case '/':
			answer = num1 / num2;
			// return quotient;
			break;

		case '%':
			answer = num1 % num2;
			break;

		}
		return answer;
	}// end- calculator

	public static void display(int num1, int num2, int calculate, char sign) {

		switch (sign) {

		case '+':
			System.out.println(num1 + " + " + num2 + " = " + calculate);
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + calculate);
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + calculate);
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + calculate);
			break;
		case '%':
			System.out.println(num1 + " % " + num2 + " = " + calculate);
			break;
		}

	}// end - display
}
