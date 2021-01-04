package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample2;

public class Demo2 extends Sample2 
{
	public static void main(String[] args) 
	{
		Sample2 ref = new Sample2();

		System.out.println(ref.v1);
		ref.test1();

		Demo2 ref2 = new Demo2();
		System.out.println(ref2.v2);
		ref2.test2();
	
	}
}
