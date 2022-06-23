package pi;

public class tours2 {
	private String nameTure;
	private String typeEating;
	private Integer Price;
	private String dateTravel;
	
	public Tour(String nameTure, String typeEating, Integer Price, String dateTravel) 
	{
		this.nameTure = nameTure;
		this.typeEating = typeEating;
		this.Price = Price;
		this.dateTravel = dateTravel;
	}
	
	public String getNameTure() { return nameTure; }
	public void setNameTure(String nameTure) { this.nameTure = nameTure; }
	
	public String getTypeEating() { return typeEating; }
	public void setTypeEating(String typeEating) { this.typeEating = typeEating; }
	
	public Integer getPrice() { return Price; }
	public void setPrice(Integer Price) { this.Price = Price; }
	
	public String getDateTravel() { return dateTravel; }
	public void setDateTravel(String dateTravel) { this.dateTravel = dateTravel; }
	
	public String toString() {
        return "Тур: \"" + nameTure + "\","
        		+ "\nТип питания:" + typeEating + ","
        		+ "\nЦена тура: " + Price + " руб."
        		+ "\nДата отправления: " + dateTravel + " г.";
	}
}
