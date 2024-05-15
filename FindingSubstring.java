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
		
		if(length2 > length1) {
			return false;
		}
		int i=0,j=0;
		int same_character_count=0;
		
		while(j<length1) {
			
			if(string1.charAt(j)==string2.charAt(i)) {
				i++;
				same_character_count++;
			}
			else {
				same_character_count=0;
				i=0;
			}
			j++;
			if(same_character_count==length2) return true;
		}
		
		return false;
	}

}
