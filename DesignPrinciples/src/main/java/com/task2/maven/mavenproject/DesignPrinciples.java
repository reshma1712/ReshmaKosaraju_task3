package com.task2.maven.mavenproject;
import java.util.*;

public class DesignPrinciples {
	public static void main(String[] args) {
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber=sc.nextInt();
        System.out.println("Enter second number:");
        int secondNumber=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int p = 1;
		while(p==1){
	        System.out.println("Enter Your Choice:");
	        int choice=sc.nextInt();
	        switch(choice){
	        case 1:c.addition(firstNumber, secondNumber);
	                break;
	        case 2:c.subtraction(firstNumber, secondNumber);
	                break;
	        case 3:c.multiplication(firstNumber, secondNumber);
	                break;
	        case 4:c.division(firstNumber, secondNumber);
	                break;
	        default:System.out.println("Invalid choice...");
	        
	        }
	        System.out.println("press 1 to continue else 0 to break");
			p = sc.nextInt();
		}
    }

}

