import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp, a, r = 0;

        temp = n;

        while (temp != 0) {
            a = temp % 10;
            r = r * 10 + a;
            temp = temp / 10;
        }

        if (r == n) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n + " is not a Palindrome number.");
        }
    }
}
