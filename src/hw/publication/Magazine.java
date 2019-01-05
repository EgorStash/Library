package hw.publication;

public class Magazine extends Text{

	private String publisher;
	
	public Magazine() {
		super();
		this.publisher = "Times";
	}
	
	public Magazine(String title, String author, int price, int year, Font font, String publisher) {
		super(title, author, price, year, font);
		this.publisher = publisher;
	}

	public String getPublisher() {    return publisher;}
	public void setPublisher(String publisher) {    this.publisher = publisher;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)    return true;
		if (!super.equals(obj))    return false;
		if (getClass() != obj.getClass())    return false;
		Magazine other = (Magazine) obj;
		if (publisher == null) {
			if (other.publisher != null)    return false;
		} else if (!publisher.equals(other.publisher))    return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Magazine: " + super.toString();
	}
	
}
