package hw.Sortable;

import java.util.Comparator;
import hw.publication.*;

public class TextComparatorByYear implements Comparator<Text> {

	@Override
	public int compare(Text o1, Text o2) {
		int yearOne = o1.getYear();
		int yearTwo = o2.getYear();
		if(yearOne < yearTwo) {
			return -1;
		} else if(yearOne == yearTwo) {
			return 0;
		} else {
			return 1;
		}
	}

	
}
