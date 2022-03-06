package com.codebode.programs;
import java.util.Scanner;
import java.text.DecimalFormat;
public class WalmartReceipt {
	// declaring variables
	public static int Qmilk=0, Qsalt=0, Qsugar=0, Qgarri=0;
	public static double Pmilk=2.5, Psalt=5.8, Psugar=3.4,Pgarri=10.0, Tax=1.8;
	public static double TPmilk=0, TPsalt=0, TPsugar=0, TPgarri=0, TPitems=0;

	public static void main(String[] args) {
	//This is the brain of the computer
	myInputMethod();
	MycalculatorMethod();
	MyoutputMethod();
	}
	public static void myInputMethod() { 
	@SuppressWarnings("resource")
	Scanner scannerObject = new Scanner(System.in);	
	 System.out.println("Please enter quantity of milk");
	 Qmilk=scannerObject.nextInt();
	 System.out.println("Please enter quantity of salt");
	 Qsalt=scannerObject.nextInt();
	 System.out.println("Please enter quantity of sugar");
	 Qsugar=scannerObject.nextInt();
	 System.out.println("Please enter quantity of garri");
	 Qgarri=scannerObject.nextInt();
	}
	
	private static void MycalculatorMethod() {
		TPmilk=Qmilk*Pmilk;
		TPsalt=Qsalt*Psalt;
		TPsugar=Qsugar*Psugar;
		TPgarri=Qgarri*Pgarri;
		TPitems=(TPmilk+TPsalt+TPsugar+TPgarri)*Tax;
		}
	private static void MyoutputMethod() {
		
	@SuppressWarnings("unused")
	DecimalFormat roundUp=new DecimalFormat ("0.00");
	System.out.println("***WALMARTRECEIPT BY PROF OBASSE********\n");
	System.out.println("**Total Amount****$" +roundUp.format(TPmilk));
	System.out.println("**Total Amount****$" +roundUp.format(TPsalt));
	System.out.println("**Total Amount****$" +roundUp.format(TPsugar));
	System.out.println("**Total Amount****$" +roundUp.format(TPgarri));
	System.out.println("**Total Amount****$" +roundUp.format(TPitems));
	System.out.println("**THANK YOU!**PLEASE COME AGAIN*************");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
