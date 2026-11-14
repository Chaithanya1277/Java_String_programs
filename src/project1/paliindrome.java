package project1;

public class paliindrome {
	public static void main(String[] args) {
		int num=121;
		int original=0;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
	
			original=original*10 + rem;
		
		}
		System.out.println(original);
		
			if( original ==num) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	
	}

}
