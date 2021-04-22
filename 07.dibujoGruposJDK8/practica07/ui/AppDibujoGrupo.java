package practica07.ui;

import practica07.dominio.Circulo;
import practica07.dominio.Cuadrado;

import practica07.util.Util;

import java.awt.Color;

public class AppDibujoGrupo
{
	public static void main( String[] args )

	{
		Dibujo dibujo = new Dibujo();
		Util.wait(0);


		Cuadrado c1 = new Cuadrado(500, 50, true, Color.RED, 200);		
		dibujo.pintar("Grupo Rojo", c1);
		dibujo.pintar("Grupo Rojo", new Circulo(100, 20, true, Color.RED, 200));
		dibujo.pintar("Grupo Azul", new Cuadrado(100, 350, false, Color.BLUE, 200));
		dibujo.pintar("Grupo Azul", new Circulo(500, 350, true, Color.BLUE, 200));
		dibujo.pintar("Grupo Verde", new Cuadrado(10, 10, true, Color.GREEN, 70));


		Util.wait(1);
		dibujo.ocultarGrupo("Grupo Azul");
		Util.wait(1);
		dibujo.ocultarGrupo("Grupo Rojo");
		Util.wait(1);
		dibujo.ocultarGrupo("Grupo Verde");
		Util.wait(1);

		dibujo.mostrarTodasFiguras();
	}
}