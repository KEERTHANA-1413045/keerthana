package Players;

public class SumOddNo {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=20;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
