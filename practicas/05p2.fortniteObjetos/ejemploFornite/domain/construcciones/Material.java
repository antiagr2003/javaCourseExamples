package ejemploFornite.domain.construcciones;

public enum Material 
{
	MARMOL(30), LADRILLO(20), MADERA(10), OTROS(5);

	int valor;

	Material(int valor)
	{
		this.valor = valor;
	}

	public int getValor()
	{
		return valor;
	}
};
