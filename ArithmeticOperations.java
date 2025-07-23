package basics;
import java.util.Scanner;
public class ArithmeticOperations {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :-  ");
		double num1 = sc.nextDouble();
		System.out.println("Enter num2 :-  ");
		double num2 = sc.nextDouble();
		double Addition = num1 + num2;
		double multiplication = num1 * num2;
		double Substraction = num1 - num2;
		double Division = num1 / num2;
		double Modulo = num1 % num2;
		System.out.println("Addition =  " + Addition);
		System.out.println("multiplication = " + multiplication);
		System.out.println("Substraction = " + Substraction);
		System.out.println("Division = " + Division);
		System.out.println("Modulo = " + Modulo);
	}
}

