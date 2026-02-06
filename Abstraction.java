abstract class Box{
int l,b,h,vol;
void getdata(){
	l=10;
	b=5;
	h=2;
}
void calc(){
	vol=l*b*h;
	System.out.println("Volume =" +vol);
}
}
  public class Abstraction extends Box{
	public static void main(String[] args){
	  Abstraction obj = new Abstraction();
	  obj.getdata();
	  obj.calc();
}
}


