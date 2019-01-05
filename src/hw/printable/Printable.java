package hw.printable;

import java.util.List;
import java.util.Set;
import hw.publication.*;

public interface Printable {
	void print(List<Text> text);
	void print(Set<Text> text);
}
