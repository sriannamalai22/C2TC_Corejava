package org.tns.Program;

public class Sri {
	void display1()
	{
		System.out.println("I am the Grandfather");
		
	}

}
class Momo extends Sri
{
	void display2()
	{
		System.out.println("I am the Father");
	}
}
class Lava extends Momo{
	void display3()
	{
		System.out.println("I am the Grandson");
		
	}
}