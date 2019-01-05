package hw.library;

import java.util.List;
import java.util.ArrayList;
import hw.publication.*;

public class Library {
	private static final Library instance = new Library();
	private List<Text> library = new ArrayList<Text>();
	
	Library(){    }
	
	public static Library createLibrary() {    return instance;}
	public List<Text> getBooks(){    return this.library;} 
	public void addBook(Text book) {    this.library.add(book);}
	public void delBook(Text book) {    this.library.remove(book);}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((library == null) ? 0: library.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)    return true;
		if(obj == null)    return false;
		if(getClass() != obj.getClass())    return false;
		Library other = (Library) obj;
		if(library == null) {
			if(other.library != null)    return false;
		} else if(!library.equals(other.library))    return false;
		return true;
	}
}
