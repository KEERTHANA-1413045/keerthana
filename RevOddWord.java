package Beginners;

import java.util.Scanner;

public class RevOddWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++){
			if(i%2==0){
				StringBuffer b=new StringBuffer(s1[i]);
				String s3=b.reverse().toString();
				s2+=s3+" ";
			}
			else
				s2+=s1[i]+" ";
		}
		System.out.print(s2);
		sc.close();
	}

}
