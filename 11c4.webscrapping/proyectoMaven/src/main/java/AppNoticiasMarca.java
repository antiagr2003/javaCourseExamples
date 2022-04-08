/*

API: https://jsoup.org/apidocs/index.html
DOC: https://jsoup.org/cookbook/extracting-data/selector-syntax

javac -cp .;jsoup-1.13.1.jar AppNoticiasMarca.java
java -cp .;jsoup-1.13.1.jar AppNoticiasMarca

Examples: https://jsoup.org/cookbook/

*/
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.ArrayList;

import java.io.IOException;

public class AppNoticiasMarca
{
	public static void main(String args[]) 
	{
		Document doc = null;

		try
		{
			//Ejemplo de Bolsa
			System.out.println("Webscrapping de https://es.investing.com/crypto/");
			doc = Jsoup.connect("https://es.investing.com/crypto/").get();
			System.out.println(doc.title());

			Elements noticias = doc.select("td[class=left noWrap elp symb js-currency-symbol]");
			for(Element noticia:noticias)
			{
				System.out.print(noticia.text() + ": ");
				System.out.println(noticia.nextElementSibling().text());
			}
		}
		catch(IOException e)
		{
			System.out.println("No me pude conectar a la web de cryptos");
			e.printStackTrace();
		}


		try
		{
			System.out.println("\n\nExtraccion de noticias de Marca");
			System.out.println("=================================\n");
			doc = Jsoup.connect("https://www.marca.com/").get();
			//Elements noticias = doc.select("h2.mod-title");
			//Elements noticias = doc.select("h2.mod-title > a:contains(MADRID)");
			Elements noticias = doc.select("h2[class=mod-title]");
			for(Element noticia:noticias)
				System.out.println(noticia.text());
		}
		catch(IOException e)
		{
			System.out.println("No me pude conectar a las noticias de Marca");
		}

		try
		{
			//Ejemplo de obtener imágenes de Marca
			System.out.println("\n\nExtraccion de imagenes");
			System.out.println("=================================\n");		
			doc = Jsoup.connect("https://www.marca.com/").get();
			Elements noticias = doc.select("figure.multimedia-item > a > img");
			for(Element noticia:noticias)
			{
				String img = noticia.attr("src");
				if(img.endsWith("jpg"))
					System.out.println(img);
			}
		}
		catch(IOException e)
		{
			System.out.println("No pude extraer las imágnes de Marca");
		}			

		//Pausa generada al finalizar el programa
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.print("Deseas finalizar: (S/N)");
		keyboard.next();
	}
}