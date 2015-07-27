
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;


public class Scrape{
	private ArrayList<Book> found = new ArrayList<Book>();
	
	public void getScrape(String query) throws IOException{
	  String url = "http://www.mycomicshop.com/search?q="+query;
	  Document doc = Jsoup.connect(url).get();
	  wipe(doc);
			
	}
	
	public void wipe(Document data){	
	  Elements content = data.select("td[itemtype=http://schema.org/Product]");
	  
	  for(Element line: content){
		 
		  String condition = line.getElementsByAttributeValue("itemprop", "itemCondition").attr("content");
		  String name = line.getElementsByAttributeValue("itemprop", "name").attr("content");
		  String[] possibleIssue =name.split(" ");
		  System.out.println(possibleIssue);
		  System.out.println(name);
		  String issueNum = possibleIssue[name.length()-2];
		  double price = Double.parseDouble(line.getElementsByAttributeValue("itemprop", "price").attr("content"));
		  
		  Book temp = new Book(name, issueNum, condition,price);
		  found.add(temp);
		  
	  }	
	}
	
	public void clean(){
		
	}
	
	public ArrayList<Book> getFoundBooks(){
		return found;
		
	}
	
	public void listOfFoundBooks(){
		for(Book item: found){
			item.summery();
		}
	}
}
