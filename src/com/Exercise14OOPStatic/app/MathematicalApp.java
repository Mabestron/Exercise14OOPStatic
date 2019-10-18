package com.Exercise14OOPStatic.app;
import com.Exercise14OOPStatic.model.MathematicalOperations;
import java.util.Scanner;

public class MathematicalApp {

	public static void main(String[] args) {
		// Variable declaration
		double base=0;
		double height=0;
		double radio=0;
		double side=0;
		double result=0;
		
		//objects construction
		
		Scanner input= new Scanner(System.in);
		MathematicalOperations myOperations = new MathematicalOperations();
		
		System.out.print("Input de base: ");
		base = input.nextDouble();
		System.out.print("Input the height: ");
		height =input.nextDouble();
		
		MathematicalOperations.areaTriangle(9.2, 7.2);

	}

}
