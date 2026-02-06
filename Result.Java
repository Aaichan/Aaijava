import java.util.Scanner;

class Result {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.print("Enter marks of 5 subjects: ");

        for (int i = 1; i <= 5; i++) {
            total = total + sc.nextInt();
        }

        float percentage = (total / 500.0f) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >= 80) {
            System.out.println("Result: Distinction");
        } 
        else if (percentage >= 60) {
            System.out.println("Result: First Division");
        } 
        else if (percentage >= 50) {
            System.out.println("Result: Second Division");
        } 
        else if (percentage >= 40) {
            System.out.println("Result: Third Division");
        } 
        else {
            System.out.println("Result: Fail");
        }
    }
}
