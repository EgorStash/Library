package hw.consolidator;

import hw.publication.Book;
import hw.publication.Font;
import hw.publication.Magazine;
import hw.publication.Newspaper;
import hw.publication.Text;

public class Consolidator{   
	
	public static Text consolidate(String... args){                     
		String textType = args[0];
		String title = args[1];
		String author = args[2];
		int price = Integer.parseInt(args[3]); 
		int year = Integer.parseInt(args[4]);
		String[] mas = args[5].split(" ");
		Font font = new Font(mas[0], Integer.parseInt(mas[1]));
		
		if(textType.equals("Book")) {
			String popularity = args[6];
			Text book = new Book(title, author, price, year, font, popularity);
			return book;
		}
		if(textType.equals("Magazine")) {
			String publisher = args[6];
			Text magazine = new Magazine(title, author, price, year, font, publisher);
			return magazine;
		}
		if(textType.equals("Newspaper")) {
			int circulation = Integer.parseInt(args[6]);
			Text newspaper = new Newspaper(title, author, price, year, font, circulation);
			return newspaper;
		} else {
			System.out.println("No such text type.");
			return null;
		}
		
	
	}
}
