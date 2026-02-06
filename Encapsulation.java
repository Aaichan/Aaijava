class Encapsulation{
private String name;
private int age;

public String getname() {
return name;
}
public int getage() {
return age;
}
public void setname(String nm) {
name=nm;
}
public void setage(int ag) {
age=ag;
}
}
public class Encapsulation {
public static void main(String[] args) {
Test obj=new Test();
obj.setname("Raaju Poudel");
obj.setage(27);
System.out.println("Name: "+obj.getname());
System.out.println("Age: "+obj.getage());
}
}



