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
			 doc = Jsoup.connect("https://www.marketwatch.com/investing/stock/aapl").get();
		System.out.println(doc.title());

		//Elements noticias = doc.select("h2.mod-title > a:contains(MADRID)");
		Elements noticias = doc.select("span[class=kv__value kv__primary]");
		for(Element noticia:noticias)
			System.out.println(noticia.text());

		//Ejemplo de obtener imágenes de Marca
		doc = Jsoup.connect("https://www.marca.com/").get();
		noticias = doc.select("figure.multimedia-item > a > img");
		for(Element noticia:noticias)
			System.out.println(noticia.attr("src"));

	}
}