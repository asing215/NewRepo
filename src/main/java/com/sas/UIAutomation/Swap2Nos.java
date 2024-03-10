package com.sas.UIAutomation;

import java.util.Scanner;

public class Swap2Nos {
	
		public static void main(String args[])
		{
			int a,b,tmp;
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			tmp=a;
			a=b;
			b=tmp;
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
	

}
