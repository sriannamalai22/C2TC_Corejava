package org.tns.Program;

public class Firstprog {
	int year_of_purchase;//data members
	String make;
	int model;
	double cost;
	public void display()//member function
	{
		System.out.println("Year of Purchase "+2023);
		System.out.println("Make "+"Himalaiyan 411 ");
	}
	void display2()
	{
		System.out.println("Model "+ 2016);
		System.out.println("Make "+275000);
	}
    public static void main (String [] args)
    {
    Firstprog ob1 = new Firstprog();
    ob1.display();
    ob1.display2();
    }
}