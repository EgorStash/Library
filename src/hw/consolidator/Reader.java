package hw.consolidator;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import hw.library.Library;
import hw.publication.Text;

public class Reader {
	
	public static void filling(Library library) {
		try{            
			String fileName = System.getProperty("user.dir")+"/src/hw/"+"Info.txt";                                 
			List<String> list = new ArrayList<String>();  
			Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).forEach(s -> list.add(s));            
			for(String line: list){                
				String[] words = line.split(", ");     
//				System.out.println(line);
				Text text = Consolidator.consolidate(words);
				library.addBook(text);
			}        
		} catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
	     catch(Exception e){
	        System.out.println("Warning: Some Other exception");
	     }
		finally {
			System.out.println("Reading done!");
		}
	}
		
}