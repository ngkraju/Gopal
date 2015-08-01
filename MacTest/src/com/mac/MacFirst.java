package com.mac;

import java.util.EnumSet;

public class MacFirst {
	
	public static void main(String arg[]){
		System.out.println("Mac Test");
		int k=50;
		System.out.println(k>50?"yes": "no");
		
		String[] items = {"adsf", "werwe", "wrwerw"};
		for(String s :items){
			System.out.println("item:"+s);
		}
		System.out.println(sum(10,20,30,40));
		for(NewTest t: EnumSet.range(NewTest.gopal, NewTest.krishna))
		{	System.out.println(t.getAge());
		System.out.println(t.getGrade());
		}
	}
	
	public static int sum(int...numb){
		int sum=0;
		for(int x:numb)
			{sum+=x;}
		return sum;
		
	}
	

}
