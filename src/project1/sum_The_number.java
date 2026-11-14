package project1;

public class sum_The_number {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		int i=num;
		while(i>0) {
			int rem=i%10;
			sum=sum+rem;
			i=i/10;
		}
		System.out.println(sum);

	}

}
