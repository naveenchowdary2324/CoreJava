package basics;
import java.util.Scanner;
public class NumberDivisibleInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 :- ");
		int num1  = sc.nextInt();
		System.out.println("Enter the number2 :- ");
		int num2 = sc.nextInt();
		for(int i = num1; i<num2;i++) {
			if(i%2 ==0 ) {
				System.out.println("The numbers Divisible by 2 are " + i);
			}
		}
	}

}
