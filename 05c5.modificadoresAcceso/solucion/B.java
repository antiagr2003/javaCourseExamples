public class B extends A
{
	private int b;
	private int c;

	public B(int a, int b)
	{
		super(a);
		this.b = b;
	}

	public void setC(int c)
	{
		this.c = c;
	}

	private String format(int x)
	{
		return String.format("%d Euros", x);
	}

	@Override
	public String toString()
	{
		return super.toString() + this.decora(this.format(b));
	}
}