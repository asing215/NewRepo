package com.sas.UIAutomation;

import java.util.Scanner;

public class SwapWithoutUsing3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
