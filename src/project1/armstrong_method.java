package project1;

public class armstrong_method {
	static int number(int num) {
		int count=0;
		int temp= num;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		return count;
		}
	static void str() {
		int i=153;
		int num=i;
		double sum=0;
	while(i>0) {
		int rem=i%10;
		double n;
		
	 n= Math.pow(rem, number(num));
		sum=sum+n;
		i=i/10;
	}
		if(sum==num) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	
	}
	
	public static void main(String[] args) {
		str();

	}

}
