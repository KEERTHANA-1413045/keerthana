package Hunters;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2="";
		String str1;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				str1=Character.toString(s.charAt(i));
				s2+=str1.toLowerCase();
			}
			else
			if(Character.isLowerCase(s.charAt(i))){
				str1=Character.toString(s.charAt(i));
				s2+=str1.toUpperCase();
			}
			else
				s2+=Character.toString(s.charAt(i));
		}
		String[] s1=s2.split(" ");
		String str="";
		for(int i=0;i<s1.length;i++){
			StringBuffer br=new StringBuffer(s1[i]);
			String s3=br.reverse().toString();
			str+=s3+" ";
		}
		System.out.println(str);
		sc.close();
	}

}
