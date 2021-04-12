public class Util
{
	public static double exec(int numero)
	{
		double calculo = 0.0;
		for(int i=0;i<9999;i++)
		{
			double sistema = Math.atan(Math.exp(Math.log10(0.00565*i*i + i*0.00345 + 0.00432*numero + 0.323)));
			calculo+=sistema;
		}
		
		return calculo;
	}
}