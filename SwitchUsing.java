package basics;
import java.util.Scanner;

public class SwitchUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :- ");
		Scanner sc = new Scanner(System.in);
		int reg_num = sc.nextInt();
		switch (reg_num){
			case 4561:
				System.out.println(reg_num + " " +"is Naveen");
				break;
			case 4593:
				System.out.println(reg_num + " " +"is Sumanth");
				break;
			case 4605:
				System.out.println(reg_num + " " +"is Reddy");
				break;
			case 4630:
				System.out.println(reg_num + " " + "is Manideep");
				break;
			default:
				System.out.println(reg_num + " " + " is Not Recognised");
		}

	}

}
