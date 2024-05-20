package com.techlabs.assignments;

import java.util.Scanner;

public class FindingSubstring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String string1,string2;
		
		System.out.println("Enter the First String : ");
		string1=scanner.next();
		
		System.out.println("Enter The Second String : ");
		string2=scanner.next();
		
		System.out.println(isSubstring(string1,string2));
			
		scanner.close();
	}
	
	private static boolean isSubstring(String string1, String string2) {
		
	 
			   
			  int length1=string1.length(); 
			  int length2=string2.length(); 
			  for(int i=0;i<length1;i++) { 
			   int j; 
			   for(j=0;j<length2;j++) { 
			    if(string1.charAt(i+j)!=string2.charAt(j)) { 
			     break; 
			      
			    } 
			   } 
			   if(j==length2) { 
			    return true; 
			   } 
			    
			  } 
			  return false; 
		
	 }

}
