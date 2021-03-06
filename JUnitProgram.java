package com.bridgelab.junitprogram;
import java.util.Scanner;

public class JUnitProgram {
	Scanner sc=new Scanner(System.in);
	private char[] dayName;
	public static int Number;

	public static void main(String[] args) {
		System.out.println("welcome to JUnit programms");
		JUnitProgram obj=new JUnitProgram();
		obj.temeratureConversion();
	   	obj.monthlyPayment();
		obj.decimalToBinary();
		squareRoot();
		obj.swapNibbles();
		obj.vendingMachine();
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
	
	public void monthlyPayment() {
		System.out.print("Enter a Principal Amount:");
		double principalAmount=sc.nextDouble();
		System.out.print("Enter a Rate Of Interest:");
		double rateOfInterest=sc.nextDouble();
		rateOfInterest=(rateOfInterest/100)/12;
		System.out.print("Enter a time period in years:");
		double timePeriod=sc.nextInt();
		timePeriod=timePeriod*12;
		double totalAmount=(principalAmount*rateOfInterest)/(1-Math.pow(1+rateOfInterest, -timePeriod));
		System.out.println("totalpayment:"+totalAmount);
	}
	
	public void decimalToBinary() {
		int remainderNumber[]=new int[1000];
		int i=0;
		System.out.print("Enter a number:");
		Number=sc.nextInt();
		while(Number>0) {
		 remainderNumber[i]=Number%2;
			Number=Number/2;
			i++;
		}
		for(int j=i-1; j>=0; j--) {
		System.out.println("Binary number is:"+ remainderNumber[j]);
	}
 }
	
	public static void squareRoot() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find square root value:");
		double number=sc.nextDouble();
		double epsilon=1e-15;
		double rootNum=number;
		while(Math.abs(rootNum-number/rootNum)>epsilon*rootNum) {
			rootNum=(number/rootNum +rootNum)/2;
		}
		System.out.println("square root of a number is:"+rootNum);
	}
	
	public void swapNibbles() {
		System.out.println("Enter a number:");
		Number=sc.nextInt();
		int output=((Number& 0x0F)<<4 | (Number& 0xF0)>>4);
		System.out.println("After swaping:"+output);
	}
	
	public void vendingMachine() {
		int total=0;
		int [] arrayNotes= { 2000, 1000, 500, 100, 50, 10, 5, 2, 1};
		System.out.print("Enter Amount::");
		int money=sc.nextInt();
		if(money>0) {
			for(int i=0; i<arrayNotes.length; i++) {
				if(money>=arrayNotes[i]) {
					int calculateNotes=money/arrayNotes[i];
					total+=calculateNotes;
					System.out.println(arrayNotes[i]+"Notes ..."+total);
					money=money%arrayNotes[i];
				}
			}
			System.out.println("Minimum number of notes"+total);
		}else {
		System.out.println("change negative");
	}
	}
}
