package Hunters;

import java.util.Scanner;

public class A3asAAA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		String s2="";
		int n;
		for(int i=0;i<s.length();i++){
			if(i<s.length()-1){
			if((s.charAt(i)>='0'&&s.charAt(i)<='9')&&(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')){
				s2=Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
				n=Integer.parseInt(s2);
				for(int k=1;k<=n;k++){
					s1+=Character.toString(s.charAt(i-1));
				}
			}
			else
			if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				 n=(int)(s.charAt(i)-'0');
				for(int j=1;j<n;j++){
					s1+=Character.toString(s.charAt(i-1));
			}
			}
			else
				s1+=Character.toString(s.charAt(i));
		}
		}
		System.out.println(s1);
		sc.close();
	}
}
