package Beginners;

import java.util.Scanner;

public class CapitalizeFirstChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		String s1="";
		for(int i=0;i<str1.length;i++){
			for(int j=0;j<str1[i].length();j++){
				if(j==0){
					String s = str1[i].substring(0,1).toUpperCase();
					s1+=s+str1[i].substring(1,str1[i].length())+" ";
				}
			}
		}
			System.out.println(s1);
			sc.close();
	}

}
