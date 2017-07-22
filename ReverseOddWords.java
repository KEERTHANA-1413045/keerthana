package Hunters;

import java.util.Scanner;

public class ReverseOddWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s="";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++){
			if(i%2==0){
			StringBuffer br=new StringBuffer(str1[i]);
			s+=br.reverse().toString()+" ";
			}
			else{
				s+=str1[i]+" ";
			}
		}
		System.out.println(s);
		sc.close();
	}

}
