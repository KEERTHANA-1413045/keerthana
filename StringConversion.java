package Players;

import java.util.Scanner;

public class StringConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=0;i<str.length();i++){
			 if(Character.isUpperCase(str.charAt(i))==true)
		        {
		            char c= (char)(str.charAt(i)+32);
		            s= s + c;
		        }
		        else if(Character.isLowerCase(str.charAt(i))==true)
		        {
		            char c= (char)(str.charAt(i)-32);
		            s = s + c;
		        }
		    }
		System.out.println(s);
		}
}
