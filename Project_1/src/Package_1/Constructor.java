package Package_1;

public class Constructor {
	
	public Constructor() {
		System.out.println("default constructor");
	}

	public Constructor(int a) {
		System.out.println("one parametrized constructor");
	}
	
	public Constructor(int a, int b) {
		System.out.println("two parametrized constructor");
	}
	
	public static void main(String[] args) {
		Constructor ref=new Constructor();
		Constructor ref1=new Constructor(25);
		Constructor ref2=new Constructor(10,23);
	}
}
