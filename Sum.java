package Players;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}

}
