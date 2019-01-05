package hw.findable;

import java.util.List;
import java.util.ArrayList;
import hw.publication.*;

public class FindByAuthor implements Findable{

	private String author;
	
	public FindByAuthor(String author) {
		this.author = author;
	}
	
	public List<Text> find(List<Text> books) {
		List<Text> findedUnits = new ArrayList<Text>();
		for(Text book: books) {
			if(book.getAuthor().equals(this.author)) {
				findedUnits.add(book);
			}
		}
		return findedUnits;
	}
	
}
