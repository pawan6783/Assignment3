package com.example.Assignment3;

import java.util.Scanner;

public class CheckSquare {
	
		public boolean isSquare(int num) {
			
			double sqRoot = Math.sqrt(num);
			if((sqRoot - Math.floor(sqRoot)) == 0)
				return true;
			return false;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		CheckSquare cs = new CheckSquare();
		boolean result = cs.isSquare(num);
		System.out.println(result);

	}

}
