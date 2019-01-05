package hw.Sortable;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import hw.publication.*;

public class SortByPrice implements Sortable{
	public Set<Text> sort(List<Text> books) {
		Comparator<Text> comparator = new TextComparatorByPrice();
		Set<Text> set = new TreeSet<Text>(comparator);
		for(Text words: books) {
			set.add(words);
		}
		return set;
	}
}
