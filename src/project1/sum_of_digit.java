package project1;
import java.util.Scanner;
public class sum_of_digit {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, temp =0;
        while(n > 0) {
        	temp = n%10;
        	sum =sum+temp;
        	n = n/10;
        }
      
        System.out.println(sum);

        
    }



}
