package project1;

public class count_digits {

	public static void main(String[] args) {
		int num=123;
		int count=0;
		for(int i=num; i>0; i=i/10) {
			int rem=i%10;
			count++;
			
		}
		System.out.println(count);
	}

}
