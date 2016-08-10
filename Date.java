package drogon;
import java.util.Scanner;
public class Date {
	public int year,month,date;
	public Date( int x,int y,int z)
	{
		year=x;
		month=y;
		date=z;
	}
	public Date()
	{
		year=0;
		month=0;
		date=0;
	}
	Scanner input=new Scanner(System.in);
	public void setval()
	{
		System.out.println("enter the year month and date");
		year=input.nextInt();
		month=input.nextInt();
		date=input.nextInt();
	}
	public int getyear()
	{
		return year;
	}
	public int getmonth()
	{
		return month;
	}
	public int getdate()
	{
		return date;
	}
	public void displayDate()
	{
		System.out.println(month+"/"+date+"/"+year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		d.setval();
		System.out.println("the date is");
		d.displayDate();	
		Date a = new Date(1997,9,8);
		System.out.println("date initialised using constructor");
		a.displayDate();
		

	}

}
