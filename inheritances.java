package one;
import java.util.Scanner;  
class A
{
	public int a=10;
	public void printA()
	{
	System.out.println("im class A");
	}
}
class B extends A
{
public int b=20;
public void printB()
{
System.out.println("im class B");
}
}
public class inheritances {
		public static void main(String args[])
		{
			B b=new B();
			b.printB();
			b.printA(); 
			System.out.println("B Blongs to A class "+b.a); 
			System.out.println("B blongs to B class "+b.b);
		}
}