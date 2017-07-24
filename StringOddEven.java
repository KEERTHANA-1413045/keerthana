package Beginners;

import java.util.Scanner;

public class StringOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String odd="";
		String even="";
		for(int i=0;i<str.length();i++){
			if(i%2==0){
				odd+=str.charAt(i);
			}
			else{
				even+=str.charAt(i);
			}
		}
		System.out.println(odd+" "+even);
		sc.close();
	}

}
