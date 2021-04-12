/*

API: https://jsoup.org/apidocs/index.html
DOC: https://jsoup.org/cookbook/extracting-data/selector-syntax

javac -cp .;jsoup-1.13.1.jar AppNoticiasMarca.java
java -cp .;jsoup-1.13.1.jar AppNoticiasMarca

*/
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.ArrayList;

public class AppNoticiasMarca
{
	public static void main(String args[]) throws Exception
	{
		//Ejemplo de Bolsa
		System.out.println("Titulo de una pagina");
		Document doc = Jsoup.connect("https://www.marketwatch.com/investing/stock/aapl").get();
		System.out.println(doc.title());


		System.out.println("\n\nExtraccion de noticias de Marca");
		System.out.println("=================================\n");
		doc = Jsoup.connect("https://www.marca.com/").get();
		//Elements noticias = doc.select("h2.mod-title > a:contains(MADRID)");
		Elements noticias = doc.select("h2[class=mod-title]");
		for(Element noticia:noticias)
			System.out.println(noticia.text());

		//Ejemplo de obtener imágenes de Marca
		System.out.println("\n\nExtraccion de imagenes");
		System.out.println("=================================\n");		
		doc = Jsoup.connect("https://www.marca.com/").get();
		noticias = doc.select("figure.multimedia-item > a > img");
		for(Element noticia:noticias)
		{
			String img = noticia.attr("src");
			if(img.endsWith("jpg"))
				System.out.println(img);
		}
	}
}