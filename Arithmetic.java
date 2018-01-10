//package

package Arithmetic;

import java.util.Scanner;

public class Arithmetic
{
	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Enter your choice(1.Rational 2.Complex):");
		int ch = scan.nextInt();		

		if(ch==1)
		{
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		Rational r3 = new Rational();
		Rational t = new Rational();

		System.out.println("Enter rational number 1:");
		r1.ip();
		System.out.println("Rational 1:" +r1);
		System.out.println("Enter rational number 2:");
		r2.ip();
		System.out.println("Rational 2:" +r2);

		r3 = t.add(r1, r2);
		System.out.println("Result of addition is:" +r3);

		r3 = t.sub(r1, r2);
		System.out.println("Result of subtraction is:" +r3);

		r3 = t.mul(r1, r2);
		System.out.println("Result of multiplication is:" +r3);

		r3 = t.div(r1, r2);
		System.out.println("Result of division is:" +r3);
		}

		else if(ch==2)
		{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		Complex p = new Complex();
		
		System.out.println("Enter complex number 1:");
		c1.ipc();
		System.out.println("Complex 1:" +c1);
		System.out.println("Enter complex number 2:");
		c2.ipc();
		System.out.println("Rational 2:" +c2);	

		c3 = p.addc(c1, c2);
		System.out.println("Result of addition is:" +c3);

		c3 = p.subc(c1, c2);
		System.out.println("Result of subtraction is:" +c3);

		c3 = p.mulc(c1, c2);
		System.out.println("Result of multiplication is:" +c3);
		}

		else
			System.out.println("Invalid input!!!");
	}
}

class Rational
{
	private int num,dem,i;
	Scanner scan =  new Scanner(System.in);
	Rational()
	{
		num = 0;
		dem = 1;
	}
	public void ip()
	{
		System.out.print("Enter numerator:");
		num = scan.nextInt();
		System.out.print("Enter denominator(!=0):");
		dem = scan.nextInt();
		i=check();
		if(i == 0)
			ip();
	}
	public int check()
	{
		if(dem == 0)
			return 0;
		else
			return 1;
	}
	public String toString()
	{
		if(num == dem)
		{ num = dem = 1; }
		else if((num % dem) == 0)
		{
			num = num / dem;
			dem =1;
		}
		else if((dem % num) == 0)
		{
			num = 1;
			dem = dem /  num;
		}
		String str = new String();
		if(dem == 1)
			str = num + " ";
		else
			str = num + "/" + dem;
		return str;
	}
	public Rational add(Rational a, Rational b)
	{
		Rational r = new Rational();
		if(a.dem == b.dem)
		{
			r.dem = a.dem;
			r.num = a.num + b.num;
		} 	
		else if((a.dem % b.dem) == 0)
		{
			r.dem = a.dem;
			r.num = a.num + (b.num *(a.dem / b.dem));
		}
		else if((b.dem % a.dem) == 0)
		{
			r.dem = b.dem;
			r.num= (a.num*(b.dem / a.dem)) + b.num;
		}
		else
		{
			r.dem = a.dem * b.dem;
			r.num = (a.num * b.dem) + (b.num * a.dem);
		}
		return r;
	}
	public Rational sub(Rational a, Rational b)
	{
		Rational r = new Rational();
		if(a.dem == b.dem)
		{
			r.dem = a.dem;
			r.num = a.num - b.num;
		} 	
		else if((a.dem % b.dem) == 0)
		{
			r.dem = a.dem;
			r.num = a.num - (b.num *(a.dem / b.dem));
		}
		else if((b.dem % a.dem) == 0)
		{
			r.dem = b.dem;
			r.num= (a.num*(b.dem / a.dem)) - b.num;
		}
		else
		{
			r.dem = a.dem * b.dem;
			r.num = (a.num * b.dem) - (b.num * a.dem);
		}
		return r;
	}
	public Rational mul(Rational a, Rational b)
	{
		Rational r = new Rational();
		if(a.num == b.dem)
		{
			r.num = b.num;
			r.dem = a.dem;
		}
		if((a.num % b.dem) == 0)
		{
			r.dem = a.dem;
			r.num = (a.num / b.dem) * b.num; 
		}
		if((b.dem % a.num) == 0)
		{
			r.num = b.num;
			r.dem = a.dem * (b.dem / a.num);
		}
		if(a.dem == b.num)
		{
			r.num = a.num;
			r.dem = b.dem;
		}
		if((a.dem % b.num) == 0)
		{
			r.num = a.num;
			r.dem = (a.dem / b.num) * b.dem;
		}
		if((b.num % a.dem) == 0)
		{
			r.dem = b.dem;
			r.num = a.num * (b.num / a.dem);
		}
		else
		{
			r.num = a.num * b.num;
			r.dem = a.dem * b.dem;
		}
		return r;
	}
	public Rational div(Rational a, Rational b)
	{
		Rational temp = new Rational();
		temp.num = b.num;
		temp.dem = b.dem;
		b.num = temp.dem;
		b.dem = temp.num;
		temp = mul(a, b);
		return temp;
	}  
}

class Complex
{
	Rational real = new Rational();
	Rational comp = new Rational();
	public void ipc()
	{
		System.out.println("Enter the real part...");
		real.ip();
		System.out.println("Enter the complex part...");
		comp.ip();
	}
	public String toString()
	{	
		String str,str1,str2;
		str1 = real.toString();
		str2 = comp.toString();
		str = str1 + " + " + str2 + "i";
		return str;
	}
	public Complex addc(Complex a, Complex b)
	{
		Complex y = new Complex();
		Rational c = new Rational();
		y.real = c.add(a.real, b.real);
		y.comp = c.add(a.comp, b.comp);
		return y;
	}
	public Complex subc(Complex a, Complex b)
	{
		Complex y = new Complex();
		Rational c = new Rational();
		y.real = c.sub(a.real, b.real);
		y.comp = c.sub(a.comp, b.comp);
		return y;
	}
	public Complex mulc(Complex a, Complex b)
	{
		Complex y = new Complex();
		Rational c = new Rational();
		Rational g = new Rational();
		Rational h = new Rational();

		g = c.mul(a.real, b.real);
		h = c.mul(a.comp, b.comp);
		y.real = c.sub(g, h);

		g = c.mul(a.real, b.comp);
		h = c.mul(a.comp, b.real);
		y.comp = c.add(g, h);

		return y;
	}
}