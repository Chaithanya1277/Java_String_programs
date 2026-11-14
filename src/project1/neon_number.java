package project1;

public class neon_number {
	public static void main(String[] args) {

		int n=9;

		        int p = n * n;
		        int t;
		        int sum = 0;

		        while (p > 0) {

		            t = p % 10;
		            sum = sum + t;
		            p = p / 10;
		        }

		        if (sum == n) {
		            System.out.println("Neon");
		        } else {
		            System.out.println("Not a Neon");
		        }
		        
		    

	}

}
