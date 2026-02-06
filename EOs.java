import java.util.Scanner;

class EOs{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int e=0;
	int o=0;
	for(int i=0; i<=100; i++)
	{
	if (i % 2 == 0){
	  e=e+i;
	}
	else{
	o = o + i;
	}
	}
	System.out.println(" Sum of even = " + e);
	System.out.println(" Sum of odd = " + o);

}
}