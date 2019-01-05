package hw.printable;

import java.util.List;
import java.util.Set;
import hw.publication.*;

public class PrintAsList implements Printable{

	public void print(List<Text> text) {
		for(Text word : text) {
			System.out.println(word);
		}
	}
	
	public void print(Set<Text> text) {
		for(Text word : text) {
			System.out.println(word);
		}
	}
}
