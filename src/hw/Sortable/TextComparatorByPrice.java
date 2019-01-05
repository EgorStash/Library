package hw.Sortable;

import java.util.List;
import java.util.ArrayList;
import hw.publication.*;
import java.util.Comparator;

public class TextComparatorByPrice implements Comparator<Text> {
	@Override
	public int compare(Text o1, Text o2) {
		int priceOne = o1.getPrice();
		int priceTwo = o2.getPrice();
		if(priceOne < priceTwo) {
			return -1;
		} else if(priceOne == priceTwo) {
			return 0;
		} else {
			return 1;
		}
	}
}
