package project1;

public class max_and_min{
		    public static void main(String[] args) {

		        int num = 1452;

		        int max = 0;
		        int min = 9;

		        while (num > 0) {

		            int digit = num % 10;

		            if (digit > max) {
		                max = digit;
		            }

		            else if(digit < min) {
		                min = digit;
		            }

		            num = num / 10;
		        }

		        System.out.println("Maximum digit = " + max);
		        System.out.println("Minimum digit = " + min);

	}

}
