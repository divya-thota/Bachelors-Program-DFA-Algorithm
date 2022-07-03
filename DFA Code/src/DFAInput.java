import java.util.Scanner;

public class DFAInput {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=s.nextLine();
		DFA obj=new DFA();
		int count= obj.Input(input);;
		if(count>3)
			System.out.println("Invalid input string.The number of a's exceed 3.");
		else
			System.out.println("Valid input string.");

	}

}
