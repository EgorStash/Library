package hw.publication;

public class Font {

	private String type;
	private int thickness;
	
	public Font() {
		this("Times New Roman", 20);
	}
	
	public Font(int thickness) {
		this("Times New Roman", thickness);
	}
	
	public Font(String type, int thickness){    
		this.type = type;
		this.thickness = thickness;				
	}
	
	public void setType(String type) {    this.type = type;}
	public String getType() {     return this.type;}
	public int getThickness() {    return thickness;}
	public void setThickness(int thickness) {    this.thickness = thickness;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + thickness;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)    return true;
		if (obj == null)    return false;
		if (getClass() != obj.getClass())    return false;
		Font other = (Font) obj;
		if (thickness != other.thickness)    return false;
		if (type == null) {
			if (other.type != null)    return false;
		} else if (!type.equals(other.type))    return false;
		return true;
	}
	
}
