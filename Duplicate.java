package drogon;
import java.util.Scanner;
public class Duplicate 
{

	public int n;//number of unique elements

	public int unique[]=new int[5];//array that stores unique elements

	Scanner input=new Scanner(System.in);
	public Duplicate()
	{
		n=0;
	}
	public void insert(int x)

	{
	for(int i=0;i<n;i++)
	{ if(unique[i]==x)
		{
		display();
	     return;
		}
	}
	System.out.println(x);
	unique[n]=x;
	n++;
	display();

	}

	public void display()

	{
	System.out.println("set of unique elements");
	for(int i=0;i<n;i++)
	{   
		System.out.println(unique[i]);
	}

	}

	public void get()

	{
	int a;
	System.out.println("enter 5 numbers between 10 and 100");
	for(int i=0;i<5;i++)
	{
		
        a=input.nextInt();
		insert(a);
		
	}

	}

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

	Duplicate d1 = new Duplicate();
	d1.get();

	}


}
