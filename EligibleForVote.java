package basics;
import java.util.Scanner;
public class EligibleForVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner agee = new Scanner(System.in);
		System.out.println("Enter your age :- ");
		int age = agee.nextInt();
		if(age>=18) {
			System.out.println("Eligible to VOTE");
		}
		else {
			System.out.println("Not Eligible to VOTE");
		}
	}

}
