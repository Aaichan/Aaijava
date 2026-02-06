import java.util.Scanner;

class Prime {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
	int c = 0;
        if (n <= 1) {
            System.out.println(n + " is not a Prime number.");
        } 
	else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.println(n + " is a Prime number.");
            } else {
                System.out.println(n + " is not a Prime number.");
            }
        }

    }
}
