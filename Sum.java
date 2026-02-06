import java.util.Scanner;

class Sum{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number");
	int n = sc.nextInt();
	int a=0;
	for(int i=0; i<=n; i++)
	{
	a = a + i;
	}
	System.out.println(" Sum = " + a);
}
}