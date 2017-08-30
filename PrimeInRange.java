package Players;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int flag;
		for(int i=n1;i<=n2;i++){
			flag=0;
			for(int j=2;j<=i;j++){
				if(i%j==0){
					flag++;
				}
			}
			if(flag==1){
				System.out.println(i);
			}
		}
		sc.close();
	}
}
