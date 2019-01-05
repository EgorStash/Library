package hw.publication;

public class Newspaper extends Text{

	private int circulation;
	
	public Newspaper() {
		super();
		this.circulation = 5000;
	}
	
	public Newspaper(String title, String author, int price, int year, Font font, int circulation) {
		super(title, author, price, year, font);
		this.circulation = circulation;
	}

	public int getCirculation() {    return circulation;}
	public void setCirculation(int circulation) {    this.circulation = circulation;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + circulation;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)    return true;
		if (!super.equals(obj))    return false;
		if (getClass() != obj.getClass())    return false;
		Newspaper other = (Newspaper) obj;
		if (circulation != other.circulation)    return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Newspaper: " + super.toString();
	}
	
}
