package hw.publication;

public abstract class Text implements Comparable<Text>{

	private String title;
	private String author;
	private int price;
	private int year;
	private Font font;
	
	public Text() {
		this("Hamlet", "Shakespeare", 1000, 19612, new Font());
	}
	
	public Text(String title, String author, int price, int year, Font font) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.year = year;
		this.font = font;
	}

	public String getTitle() {    return title;}
	public void setTitle(String title) {    this.title = title;}
	public String getAuthor() {	   return author;}
	public void setAuthor(String author) {    this.author = author;}
	public int getPrice() {    return price;}
	public void setPrice(int price) {    this.price = price;}
	public int getYear() {    return year;}
	public void setYear(int year) {    this.year = year;}
	public Font getFont() {    return font;}
	public void setFont(Font font) {    this.font = font;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((font == null) ? 0 : font.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)    return true;
		if (obj == null)    return false;
		if (getClass() != obj.getClass())    return false;
		Text other = (Text) obj;
		if (author == null) {
			if (other.author != null)    return false;
		} else if (!author.equals(other.author))    return false;
		if (font == null) {
			if (other.font != null)    return false;
		} else if (!font.equals(other.font))    return false;
		if (price != other.price)    return false;
		if (title == null) {
			if (other.title != null)    return false;
		} else if (!title.equals(other.title))    return false;
		if (year != other.year)    return false;
		return true;
	}
	
	@Override
	public int compareTo(Text anotherText) { //sorted by year in hashSet or treeSet
		int anotherTextYear = anotherText.getYear();
		return this.year - anotherTextYear;
	}
	
	@Override
	public String toString() {
		return "\'" + getTitle() + "\' written by " + getAuthor() + " in " + getYear() + " year, and will cost you " + getPrice() + " dollars. Font: " + font.getType() + " with " + font.getThickness() + " thickness";
	}
	
//	abstract 
}
