package com.sas.UIAutomation;

import java.util.HashMap;

public class xyz {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
		String str="leetcode";
		char[] ch=str.toCharArray();
		int temp=0;
		for(int i=0;i<ch.length-2;i++)
		{
			for (int j=i+1;j<ch.length-1;j++)
			{
				if(ch[i]==ch[j])
					break;
					
			}
			System.out.println(i);
								
		}
		
        
    }
}
