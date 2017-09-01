package qq;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=1;
		String str="";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i!=j&&s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				str+=Character.toString(s.charAt(i));
			}
			count=1;
		}
		System.out.println(str);
		sc.close();
	}

}
