package drogon;
import java.util.Scanner;
public class Commissions 
	{
	
	public int s;//number of salesperson
	public int[] gross;//array that stores the gross of each salesman
	public int[] count=new int[9];//array that counts the employees in a particular range
	
	Scanner input=new Scanner(System.in);

	public void set()
	{
		System.out.println(" Enter the number of salepersons ");
		s=input.nextInt();
		gross=new int[s];
		System.out.println("Enter the gross for the salesperson");
		for(int i=0;i<s;i++)
			gross[i]=input.nextInt();
	}
	public void calc()
	{
		for(int i=0;i<s;i++)
			gross[i]=(int) (200+(0.09)*gross[i]);
		
	}
	
	public void counter()
	{

		for(int i=0;i<s;i++)
		{
			if( gross[i]<300 )
				count[0]++;
			else if(gross[i]<400)
				count[1]++;
			else if(gross[i]<500)
				count[2]++;
			else if(gross[i]<600)
				count[3]++;
			else if(gross[i]<700)
				count[4]++;
			else if(gross[i]<800)
				count[5]++;
			else if(gross[i]<900)
				count[6]++;
			else if(gross[i]<1000)
				count[7]++;
			else if(gross[i]>=1000)
				count[8]++;
		}
	}
		public void display()
		{
			System.out.println("salary        $200-299  $300-399  $400-499  $500-599  $600-699  $700-799  $800-899  $900-999  above $1000");
		    System.out.printf("count        ");
			for(int i=0;i<9;i++)
				System.out.printf("    "+count[i]+"     ");
				
		}

		public static void main(String[] args) {
			Commissions c=new Commissions();
			c.set();
			c.calc();
			c.counter();
			c.display();
			
			// TODO Auto-generated method stub

		}

	

}