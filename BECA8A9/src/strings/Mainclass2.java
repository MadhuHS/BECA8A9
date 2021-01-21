package strings;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
       String str1 = new String("hello"); 
       String str2 = new String("hello"); 
       String str3 = "hello";
       String str4 = "hello";
       String str5 = "world";
       String str6 = str1 + str5;
       String str7 = str1 + "world";
       String str8 = "hello"+"world";
       String str9 = "helloworld";
            
       System.out.println(str1 == str2);//compare address
       System.out.println(str3 == str4);//compare address
       System.out.println(str1 == str3);//compare address
       System.out.println(str6 == str7);//compare address
       System.out.println(str8 == str9);//compare address
            
	}
}
