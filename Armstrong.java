import java.util.Scanner;

class Armstrong{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n, temp, a, s = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while (temp != 0) {
            a = temp % 10;
            s = s + (a * a * a);
            temp = temp / 10;
        }

        if (s == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is NOT an Armstrong number.");
        }
    }
}
