import java.util.Scanner;

class sresult {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.print("Enter marks of 5 subjects: ");

        for (int i = 1; i <= 5; i++) {
            total = total + sc.nextInt();
        }

        float percent = (total / 500.0f) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percent);
 	
	
	int p = (int)percent/10;



	switch(p)
{
        case 10,9,8: {
            System.out.println(" Grade : A");
	break;
        } 
        case 7,6: {
            System.out.println(" Grade : B ");
	break;
        } 
        case 5,4: {
            System.out.println(" Grade : C ");
	break;
        } 
        case 3,2: {
            System.out.println(" Grade : D ");
	break;
        } 
        default: {
            System.out.println("Fail");
        }
}
   }
}
