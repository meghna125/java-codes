

import java.util.Scanner;

class matr
{
	int r;
	int c;
	int[][] arr;
	Scanner scan=new Scanner(System.in);
	int i,j,k;
	
	

	public void inno()
	{
		r=scan.nextInt();
		c=scan.nextInt();
		arr=new int[r][c];
	}

	public void input()
	{
		for(i=0;i<r;i++)
		  for(j=0;j<c;j++)
		    arr[i][j]=scan.nextInt();
	}
		
	public String toString()
	{
		String str=new String();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				str+=arr[i][j]+ " ";
			}
			str+="\n";
		}
		return str; 
	}

	public int check1(matr a,matr b)
	{
		if((a.r==b.r) && (a.c==b.c))
			return 1;
		else
			return 0;
	}

	public int check2(matr a,matr b)
	{
		if(a.c==b.r)
			return 1;
		else
			return 0;
	}
        
        public matr mul(matr a,matr b)
	{
		matr m=new matr();
		m.r=a.r;
		m.c=b.c;
		m.arr=new int[m.r][m.c];
		for(i=0;i<m.r;i++)
			for(j=0;j<m.c;j++)
				m.arr[i][j]=0;

		for(i=0;i<m.r;i++)
			for(j=0;j<m.c;j++)
				for(k=0;k<a.r;k++)
					m.arr[i][j]+=(a.arr[i][k]*b.arr[k][j]);

		return m;
	}

	public matr add(matr a,matr b)
	{
		matr m=new matr();
		m.r=a.r;
		m.c=a.c;
		m.arr=new int[m.r][m.c];
		for(i=0;i<a.r;i++)
			for(j=0;j<a.c;j++)
				m.arr[i][j]=a.arr[i][j] + b.arr[i][j];
		
		return m;
	}

	public matr sub(matr a,matr b)
	{
		matr m=new matr();
		m.r=a.r;
		m.c=a.c;
		m.arr=new int[m.r][m.c];
		for(i=0;i<a.r;i++)
			for(j=0;j<a.c;j++)
				m.arr[i][j]=a.arr[i][j] - b.arr[i][j];
		
		return m;
	}

	
}

public class matrix
{
	public static void main(String[] args)
	{
		matr o1=new matr();
		matr o2=new matr();
		matr o3=new matr();
		matr g=new matr();
		System.out.println("Enter dimensions of matrix 1: ");
		o1.inno();
		System.out.println("Enter matrix 1:");
		o1.input();
		System.out.println("Matrix 1 is:");
		System.out.println(o1);
		System.out.println("Enter dimensions of matrix 2: ");
		o2.inno();
		System.out.println("Enter matrix 2:");
		o2.input();
		System.out.println("Matrix 1 is:");
		System.out.println(o2);
		int p=g.check1(o1,o2);
		if(p==1)
		{
			o3=g.add(o1,o2);
			System.out.println(" addition is: ");
			System.out.println(o3);
			o3=g.sub(o1,o2);
			System.out.println(" subtraction is: ");
			System.out.println(o3);
		}
		else
			System.out.println("Addition and Subtraction not possible");
		int q=g.check2(o1,o2);

		if(q==1)
		{
			o3=g.mul(o1,o2);
			System.out.println("multiplication is : ");
			System.out.println(o3);
		}
		else
			System.out.println("Multiplication no possible");
	}
}
	
