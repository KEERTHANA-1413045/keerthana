package flowControl;
import java.util.*;
public class Prime10nd99 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)
		int count;
		int m=sc.nextInt();
		int k=sc.nextInt();
		for(int i=m;i<=k;i++){
			count=0;
			for(int n=1;n<=i;n++)
			{
				if(i%n==0)
				{
					count++;
				}
			}
			if(count==2){
				System.out.println(i);
			}
			}
	}

}
