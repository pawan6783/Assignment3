package com.example.Assignment3;

import java.util.Scanner;

public class ReverseString {
	
	
	public String reverse(String temp) {
		StringBuilder sb= new StringBuilder(temp);
		sb.reverse();
		return sb.toString();
	}
	
	public String reverseString(String str) {

		
		String[] temp = str.split("\\s");
		for(int i=0;i<temp.length;i++) {
			if(temp[i].length() >= 5) {
				temp[i]= reverse(temp[i]);
			}
		}
		
		String result="";
		for(String it: temp) {
			result = result.concat(it+" "); 
		}
		return result.trim();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		ReverseString rs = new ReverseString();
		String result = rs.reverseString(str);
		System.out.println(result);
	}

}
