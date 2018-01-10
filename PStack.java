import java.util.Scanner;
import java.util.ArrayList;

abstract class Stack
{
	public abstract void push(int a);
	public abstract int pop();
}

class DynamicStack extends Stack
{
	private ArrayList<Integer> S;
	private int top;
	
	public DynamicStack()
	{
		S = new ArrayList<Integer>();
		top=-1;
	}

	public void push(int a) // overriding the superclass push method
	{
		S.add(a);   // It has no Overflow Condition  
		top++;
	}

	public int pop() // overriding the subclass pop method
	{
		if(top==-1)
			return -1; 
		else
		{
			int r = S.remove(top);  // returns the top of the stack after popping it
			top--;
			return r;
		}
	}

	public String toString()
	{
		String s=" ";
		
		for(int i=top;i>=0;i--)
		{
			s = s + S.get(i) + " ";
		}
		
		return s;
	}
}

class StaticStack extends Stack
{
	private int []a;
	private int top,n;
	
	public StaticStack(int n)
	{
		this.n=n;
		top=-1;
		a=new int[n];
	}

	public void push(int a) // overriding the superclass push method
	{
		if(top==n-1)
			System.out.print("\n Stack is Overflowed ");
		else
		{
			this.top++;
			this.a[top]=a;
		}
	}

	public int pop() // overriding the subclass pop method
	{
		if(top==-1)
			return -1; 
		else
		{
			int r = a[top];  // returns the top of the stack after popping it
			top--;
			return r;
		}
	}

	public String toString()
	{
		String s=" ";
		
		for(int i=top;i>=0;i--)
		{
			s = s + a[i] + " ";
		}
		
		return s;
	}
}

public class PStack
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\n  Implentation Options \n");
		System.out.print("\n 1. Through Arraylist \n");
		System.out.print("\n 2. Through Array \n");
		System.out.print("\n Enter ur choice : "); 
		int ch=in.nextInt();		

		switch(ch)
		{
			case 1:	System.out.print("\n\t Implementing Stack with Arraylist \t");
				Stack d1 = new DynamicStack();
				System.out.print("\n\n Enter total no of elements that is to be pushed on to the stack : ");
				int n = in.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.print("\n Enter the " + (i+1) + " number : ");
					int k = in.nextInt();
					d1.push(k);
				}
				System.out.print("\n The Stack is as follows : ");
				System.out.print(d1);
				System.out.print("\n\n\t Stack Pop Operation : \n");
				int z=d1.pop();
				if(z==-1)
					System.out.print("\n Stack Underflowed ");
				else
					System.out.print("\n The element popped from the stack is : " + z + "\n");
				System.out.print("\n The state of stack is : "); 
				System.out.print(d1 + "\n");
				break;

			case 2:	System.out.print("\n\t Implementing Stack with Array \t");
				System.out.print("\n\n Enter total no of elements that is to be pushed on to the stack : ");
				int n1 = in.nextInt();
				Stack d2 = new StaticStack(n1);
				for(int i=0;i<n1;i++)
				{
					System.out.print("\n Enter the " + (i+1) + " number : ");
					int k1 = in.nextInt();
					d2.push(k1);
				}
				System.out.print("\n The Stack is as follows : ");
				System.out.print(d2);
				System.out.print("\n\n\t Stack Pop Operation : \n");
				int z1=d2.pop();
				if(z1==-1)
					System.out.print("\n Stack Underflowed ");
				else
					System.out.print("\n The element popped from the stack is : " + z1 + "\n");
				System.out.print("\n The state of stack is : "); 
				System.out.print(d2 + "\n");
				break;
		}
	}
}				
