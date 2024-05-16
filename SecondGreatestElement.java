package com.techlabs.assignments;

import java.util.Scanner;

public class SecondGreatestElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The size of the array :");
		int size= scanner.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter The values of array :");
		
		int previous=0,current=0;
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			
			if(array[i]>=current) {
				previous=current;
				current=array[i];
			}
		}
		System.out.println("Second largest number is "+previous);
		scanner.close();

	}

}
