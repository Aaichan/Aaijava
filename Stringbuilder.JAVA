import java.util.Scanner;
class Stringbuilder {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Chicken");
	sb.append("Banana");
	System.out.println(sb);

        StringBuilder sd = new StringBuilder("Chicken");
	sd.insert(4,"Banana");
	System.out.println(sd);

        StringBuilder se = new StringBuilder("Chicken");
	se.replace(3,5,"Banana");
	System.out.println(se);

        StringBuilder sf = new StringBuilder("Chicken");
	sf.delete(2,5);
	System.out.println(sf);

        StringBuilder sg = new StringBuilder("Chicken");
	sg.reverse();
	System.out.println(sg);

        StringBuilder sk = new StringBuilder("Konnichiwa");
	System.out.println(sk);
	System.out.println("Capacity= " + sk.capacity());
	System.out.println("Length= " + sk.length());

        StringBuilder sch = new StringBuilder("Chicken");
	System.out.println(sch);
	System.out.println("K xa 3 ma = " + sch.charAt(3));
	sch.setCharAt(1, 'e');
	sch.setLength(2);
	System.out.println("k rakheko= " + sch);
	System.out.println("k Bhayo= " + sch.charAt(1));




}
}
