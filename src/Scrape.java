
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scrape{
	public void printDoc() throws IOException{
	  String url = "https://www.mycomicshop.com/search?TID=27228596";
	  Document doc = Jsoup.connect(url).get();
	  Elements content = doc.getElementsByClass("price");
	  System.out.println(content);
	  for(Element line: content){
		  System.out.println(line);
		  
	  }
			  
	 // System.out.println(doc);
	}
}
