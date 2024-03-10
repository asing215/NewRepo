package com.sas.UIAutomation;

//Reverse String without using String functions
public class RenameUsingStringBuilder {
	public static void main(String args[])
	{
		String sts="Demo I";
		StringBuilder str2 =new StringBuilder();
		str2.append(sts);
		str2=str2.reverse();
		System.out.println("Reversed String = "+str2);
	}

}


