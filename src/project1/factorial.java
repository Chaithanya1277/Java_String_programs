import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

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


	
