package com.bridgelab.junitprogram;
import java.util.Scanner;

public class JUnitProgram {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("welcome to JUnit programms");
		JUnitProgram obj=new JUnitProgram();
		obj.temeratureConversion();
	}
	
	public void temeratureConversion() {
		double fahrenheit, celsius;
		System.out.println("Choose a nomber\n1.Fahrenheit to celsius \n2.celsius to Farenheit");
		int number=sc.nextInt();
		switch(number) {
		case 1:
			System.out.print("Enter a Fahrenheit temperature:");
			fahrenheit=sc.nextDouble();
			celsius=(fahrenheit-32)*5/9;
			System.out.println("celsius temperature is:"+celsius);
			break;
		case 2:
			System.out.print("Enter a celsius temperature:");
			celsius=sc.nextDouble();
			fahrenheit=((9*celsius)/5)+32;
			System.out.println("fahrenheit temperature is:"+fahrenheit);
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}
}
