public class B extends A
{
	private int b;
	int c;

	public B(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	private String format(int x)
	{
		return String.format("%d Euros", x);
	}

	@Override
	public String toString()
	{
		return a + this.decora(this.format(b));
	}
}