package org.tns.Program;
import java.util.Scanner;


public class Multiples {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int number = sc.nextInt();
			if(number % 7 == 0) {
				System.out.println(number +"is a multiples of 7");
				}
			else {
				System.out.println(number +"is not a multiples of 7");
			}
		}

	}

}