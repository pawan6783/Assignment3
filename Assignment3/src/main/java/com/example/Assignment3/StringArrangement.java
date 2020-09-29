package com.example.Assignment3;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class StringArrangement {
	
	public String arrangeString(String str) {
		
		if(str.length()==0) {
			return "";
		}
				
		String[] words = str.split("\\s");
		String[] temp = new String[str.length()];
		
		for(int i=0;i<words.length;i++) {
			
			int len = words[i].length();		
			char[] charArray = words[i].toCharArray();

			for(int j=0;j<len;j++) {				
				if(charArray[j]>=49 && charArray[j]<=57) {					
					temp[charArray[j]-49] = words[i];
					break;
				}
			}
		}
	
		
		String result = "";
		for(int i=0;i<words.length;i++) {
			result = result + temp[i] + " ";
		}
		
		return result.trim();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringArrangement sa = new StringArrangement();
		String result = sa.arrangeString(str);
		System.out.println(result);
		
	}

}
