package Package_1;

public class homewrm_1stcls {
	int age;
	int roll_no;
	
	public void student()
	{
		System.out.println("welcome to all of you");
	}
	
	public static void main(String []args)
	{
		homewrm_1stcls refvar=new homewrm_1stcls();
		refvar.student();
		refvar.age=30;
		refvar.roll_no=10;
		System.out.println("Age is : " + refvar.age);
		System.out.println("Roll no is : " + refvar.roll_no);
		
	}

}
