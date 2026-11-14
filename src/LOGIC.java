import java.util.Scanner;

public class LOGIC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
	
		for(int num=start;num<=end;num++) {
			int count=0;
			if(num>2) {
				continue;
			}
			
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(num);
			
			
		}
		
	}
}
}