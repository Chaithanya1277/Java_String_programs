package project1;

public class reverse {

	public static void main(String[] args) {
		int num=121;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			int original=0;
			original=original*10 + rem;
			System.out.print(original);
		}
		
			if( original ==num) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	
	
	}
}
