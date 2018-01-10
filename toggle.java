import java.util.Scanner;

public class toggle
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("\n Enter the number you want to toggle : ");
		int number = in.nextInt();

		System.out.print("\n Enter the bit(0-n) to toggle : ");
		int n = in.nextInt();
		
		int k=0;
		k = number^(1<<n);
		
		System.out.print("\n Bit has Been Toggled ");
		System.out.print("\n\n The Number after Toggling : " + k + "\n");
	}
}
