package basics;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks :- ");
		int marks = sc.nextInt();
		if(marks >=90 && marks <100) {
			System.out.println("Grade A");
		}
		else if(marks>= 75 && marks <90) {
			System.out.println("Grade B");
		}
		else if(marks>= 60 && marks <75) {
			System.out.println("Grade C");
		}
		else if(marks>= 45 && marks <60) {
			System.out.println("Grade D");
		}
		else if(marks>= 0 && marks <45){
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter correct marks !");
		}
	}

}
