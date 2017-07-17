package Players;

import java.util.Scanner;

public class RevStrAndRepVow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer br=new StringBuffer(str);
		String str1=br.reverse().toString();
		String str2=str1.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str1);
		System.out.println(str2);
		sc.close();
	}

}
