public class A
{
	private int a;
	
	public A(int a)
	{
		this.a = a;
	}

	private String decora(String texto)
	{
		return String.format("<< %s >>", texto);
	}

	@Override
	public String toString()
	{
		return this.decora(String.valueOf(a));
	}
}