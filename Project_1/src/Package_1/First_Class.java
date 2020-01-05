package Package_1;

public class First_Class {
	int a;
	
	public void rahul()
	{
		System.out.println("This is first program");
		
	}
	
	public static void main(String[] args) {
		First_Class ref=new First_Class();
		ref.rahul();
		ref.a=1987;
		System.out.println(ref.a);
		ref.a=29;
		System.out.println(ref.a);
		
	}
}
 