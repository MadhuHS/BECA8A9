package com.jspiders.pkg1;

public class Sample2 
{
    public    int    v1 = 100;
    protected double v2 = 100;
              long   v3 = 9987617282882l;
    private   String v4 = "hello";
    
    public void test1()  
    {
	  System.out.println("this is public-test1() of Sample2");
	}
    
    protected void test2()  
    {
	  System.out.println("this is protected-test2() of Sample2");
	}
	
    void test3()  
    {
	  System.out.println("this is pkglevel-test3() of Sample2");
	}
    
    private void test4()  
    {
	  System.out.println("this is private-test4() of Sample2");
	}
	
	public static void main(String[] args) 
	{

	}

}
