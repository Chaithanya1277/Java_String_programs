package project1;

import java.util.Scanner;

public class per {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int original = num;
			int q=0;
			for (int i =1;i >0;i++) {
				if(num%i ==0) {
					q=q+i;
				}
			}
			q=q-original;
			
			if (original==q) {
				System.out.println("perfect");
			}
			else {
				System.out.println("not perfect");
		
			sc.close();
	}
}
}
