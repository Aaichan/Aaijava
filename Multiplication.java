import java.util.Scanner;

class Multiplication{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	System.out.println(" Multiplication of " + n + " is");

	for(int i=0; i<=10; i++)
	{
	System.out.println(n + "x" + i + "=" + (n*i) );
	}
}
}