package project1;

public class palindrome {
	static int check(int num) {
		int sum=0;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			sum=sum*10+rem;
		}
		return sum;
	}
	static int origin() {
		int original=122;
		return original;
		}
	static void dupli() {
		int num=origin();
		if(num==check(num)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		dupli();
	}

}
