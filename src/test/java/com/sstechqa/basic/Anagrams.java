package com.sstechqa.basic;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
	
		//1. Take two string as input.
		//2.convert two strings to character array
		//3. sort two  arrays using arrays.sort()method
		//4. Compare two string arrays if they are equal they are anagrams or not
     String str1 = "Abiryusuf";
     String str2="fusuyribb";
     System.out.println(method1(str1, str2));
     
	}
public static boolean method1(String str1, String str2) {
	char[] char1 =str1.toCharArray();
	char[] char2 =str2.toCharArray();
 Arrays.sort(char1);
 Arrays.sort(char2);
 
	return Arrays.equals(char1, char2);
}
}
