package hw.publication;

public class Book extends Text{

	private String popularity;
	
	public Book() {
		super();
		this.popularity = "High";
	}
	
	public Book(String title, String author, int price, int year, Font font, String popularity) {
		super(title, author, price, year, font);
		this.popularity = popularity;
	}

	public String getPopularity() {    return popularity;}
	public void setPopularity(String popularity) {    this.popularity = popularity;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((popularity == null) ? 0 : popularity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)    return true;
		if (!super.equals(obj))    return false;
		if (getClass() != obj.getClass())    return false;
		Book other = (Book) obj;
		if (popularity == null) {
			if (other.popularity != null)    return false;
		} else if (!popularity.equals(other.popularity))    return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Book: " + super.toString();
	}
	
}
