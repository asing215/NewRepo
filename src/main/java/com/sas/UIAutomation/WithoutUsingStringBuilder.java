package com.sas.UIAutomation;

public class WithoutUsingStringBuilder {
	public static void main(String args[])
	{
		String sts="Demo I";
		char str2[] =sts.toCharArray();
		for(int i=str2.length-1;i>=0;i--) 
			System.out.print(str2[i]);
	
	}
}
