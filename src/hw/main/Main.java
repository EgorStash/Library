package hw.main;

import java.util.List;
import java.util.Set;
import hw.findable.Findable;
import hw.Sortable.SortByPrice;
import hw.Sortable.SortByYear;
import hw.Sortable.Sortable;
import hw.consolidator.Reader;
import hw.findable.FindByAuthor;
import hw.library.Library;
import hw.printable.PrintAsList;
import hw.printable.Printable;
import hw.publication.Text;

public class Main {

	public static void main(String[] args) {
		Library library = Library.createLibrary();
		Reader.filling(library);
		
		Findable matcher = new FindByAuthor("Morgan Freeman");
		List<Text> finded = matcher.find(library.getBooks());
		
		Sortable sorterOne = new SortByPrice();
		Set<Text> sortedByPrice = sorterOne.sort(finded);

		Sortable sorterTwo = new SortByYear();
		Set<Text> sortedByYear = sorterTwo.sort(finded);
		
		Printable printer = new PrintAsList();
		
		System.out.println("All books:");
		printer.print(library.getBooks());
		System.out.println();
		System.out.println("Sorted by price for Morgan Freeman:");
		printer.print(sortedByPrice);
		System.out.println();
		System.out.println("Sorted by year for Morgan Freeman:");
		printer.print(sortedByYear);
		
	}
	
}
