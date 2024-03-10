package com.sas.UIAutomation;

public class StringMethods {

	public static void main(String[] args) {
		String str="Denmark is very very good";
		
		//find length of string
		System.out.println("String length: "+str.length());		
			
		//charAt of string
		System.out.println("CharAt of string : "+str.charAt(11));
		
		//substring from the ith  index character to end
		System.out.println("CharAt of string : "+str.substring(9));
		
		//substring from i to j-1 index
		System.out.println("CharAt of string : "+str.substring(9,15));
		
		//concat of String
		String str2=" maybe";
		System.out.println("Concatenation of string : "+str.concat(str2));
		
		// Find index of a string
		int index=str.indexOf("is");
		System.out.println("String index: "+index);
		
		int index2=str.indexOf("er",14);
		//output should be 16
		System.out.println("String index after specified index: "+index2);
		
		//last index of
		System.out.println("Last index after specified charactr: "+str.lastIndexOf("o"));
		
		//boolean equals
		boolean output= "Alka".equals("Alka");
		boolean output2= "Alka".equalsIgnoreCase("aLKa");
		System.out.println(output);
		System.out.println(output2);
		
		//compare 2 strings
		boolean out3="alka".compareTo("dsvf")<0;
		System.out.println("Compare alka and dsvf: "+output2);
	    
		//toupper and toLower case
		System.out.println("To upper case: "+str.toUpperCase());
		System.out.println("To lower case: "+str.toLowerCase());
		
		String oldstr="Old";
		String newstr=oldstr.replace("O", "G");
		System.out.println("Replaced string of O in Old: "+newstr);
        
		//contains string in given string
		boolean output4=str.contains(oldstr);
		System.out.println("Contains String = "+output4);
		
		//toCharArray
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		System.out.print(ch[i]);
		
		//Return true if string starts with this prefix.
		String s1="geeksforgeeks";
		String s2="geeks";
		System.out.println();	
		System.out.println("Starts with = "+s1.startsWith(s2));
		
	}

}
