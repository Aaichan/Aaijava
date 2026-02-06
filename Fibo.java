import java.util.Scanner;

class Fibo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
	int a = 0, b = 1, c;

        System.out.println("Fibonacci Series up to 10th term:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }
}
