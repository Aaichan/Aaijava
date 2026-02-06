import java.util.Scanner;

class eot{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is " + result);
    }
}
