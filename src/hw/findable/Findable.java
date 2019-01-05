package hw.findable;

import java.util.List;
import hw.publication.*;

public interface Findable {
	List<Text> find(List<Text> words);
}
