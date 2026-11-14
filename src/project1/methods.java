package project1;
public class methods {
static boolean isPrime(int num){
	if(num<2) {
		return false;
	}int count=0;
	for(int i=2;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	return count==1;	
	}
static void Print(int start,int end) {
	for(int num=start;num<=end;num++) {
		if(isPrime(num)) {
			System.out.print(num);
		}
	}
	
}


	public static void main(String[] args) {
	Print(1,10);
	
}
}