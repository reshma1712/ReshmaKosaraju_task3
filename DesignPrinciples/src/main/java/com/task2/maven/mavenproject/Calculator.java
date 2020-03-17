package com.task2.maven.mavenproject;

public class Calculator {
	void addition (float a,float b){
		System.out.println(a + " + " +b +" = "+(a+b));
	}
	void subtraction (float a,float b){
		System.out.println(a + " - " +b +" = "+(a-b));
	}

	void  multiplication(float a,float b){
		System.out.println(a + " * " +b +" = "+(a*b));
	}

	void division (float a,float b){
		if(b==0){
			System.out.println("The value cannot be divisible by zero");
		}
		else{
		System.out.println(a + " / " +b +" = "+(a/b));
		}
	}
}
