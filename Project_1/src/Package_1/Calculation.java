package Package_1;

public class Calculation {
int a;
int b;
 public int sum(int a, int b)
 {
	 
	 int c=a+b;
	 return c;
 }
 public int sub(int a, int b)
 {
	 
	 int c=a-b;
	 return c;
 }


 
public static void main(String[] args) {
	Calculation ref=new Calculation();
	//ref.a=10;
	//ref.b=5;
	
	
	
	System.out.println("Sum is : " + ref.sum(10,5));
	System.out.println("Sub is : " + ref.sub(10,5));
	
	
	
}
}
