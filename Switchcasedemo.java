import java.util.Scanner;

public class Switchcasedemo 
{
	public static void main(String args[]) 
	{
		int Choice;
		System.out.println("Choose One : 1.Hi\t2.Hey\t3.Hello\t");
		Scanner m = new Scanner(System.in);
		Choice = m.nextInt();
		switch(Choice)
		{
			case 1 : System.out.println("You Said 'Hi' ");
				break;
			case 2 : System.out.println("You Said 'Hi' ");
				break;
			case 3 : System.out.println("You Said 'Hi' ");
				break;
				default : System.out.println("Invalid Choice.");
		}
	}
}
