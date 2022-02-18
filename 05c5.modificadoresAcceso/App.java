public class App
{
	public static void main(String[] args) 
	{
		A a = new A(1);
		B b = new B(1, 2);
		b.c = 33;
		System.out.println(a);
		System.out.println(b);
	}
}