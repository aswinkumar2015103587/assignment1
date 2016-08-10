package drogon;
import java.util.Scanner;

public class Employee {
	public String firstname,lastname;
	public double salary;
	public Employee(String s1,String s2,double d)
	{
		firstname=s1;
		lastname=s2;
		if(d>=0)
		salary=d;
	}
	public Employee()
	{
		firstname=null;
		lastname=null;
		salary=0;
		
	}
	Scanner input= new Scanner(System.in);
	public void setval()
	{System.out.println("enter the first name last name and salary");
	firstname=input.next();
	lastname=input.next();
	double d=input.nextDouble();
	if(d>=0)
		salary=d;
	}
	public String getfname()
	{
		return firstname;
	}
	public String getlname()
	{
		return lastname;
	}
	public Double getsalary()
	{
		return salary;
	}
	public void inc()
	{
		salary=salary+0.1*salary;
		
	}
	public void display()
	{
		System.out.println("first name is "+ firstname);
		System.out.println("second name is "+ lastname);
		System.out.println("salary is" + salary*12);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("tyrion", "lannister", 80000);
		Employee e2=new Employee();
		e2.setval();
		e1.display();
		e2.display();
		e1.inc();
		e2.inc();
		System.out.println("after giving the employees a 10% raise");
		e1.display();
		e2.display();
	}

}
