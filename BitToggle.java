import java.util.Scanner;

public class BitToggle
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("\n Enter the number which you want to toggle : ");
		int num = in.nextInt();

		System.out.print("\n Enter the bit (0-n) to3e toggle : ");
		int n = in.nextInt();
		
		int num1=0;
		num1 = num^(1<<n);
		
		System.out.print("\n Bit has Been Toggled ");
		System.out.print("\n\n The Number after Toggling : " + num1 + "\n");
	}
}
