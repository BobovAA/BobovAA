package pi;

public class trip2 {
	private String nameTure;
	private String Country;
	private String Town;
	private String typeMove;
	private String typeEating;
	private Integer Price;
	private String typeLiving;
	private String dateTravel;
	
	public touristTrip(String nameTure, String Country, String Town, String typeMove, String typeEating, Integer Price,  String typeLiving, String dateTravel) 
	{
		this.nameTure = nameTure;
		this.Country = Country;
		this.Town = Town;
		this.typeMove = typeMove;
		this.typeEating = typeEating;
		this.Price = Price;
		this.typeLiving = typeLiving;
		this.dateTravel = dateTravel;
	}
	
	public String getNameTure() { return nameTure; }
	public void setNameTure(String nameTure) { this.nameTure = nameTure; }
	
	public String getCountry() { return Country; }
	public void setCountry(String Country) { this.Country = Country; }
	
	public String getTown() { return Town; }
	public void setTown(String Town) { this.Town = Town; }
	
	public String getTypeMove() { return typeMove; }
	public void setTypeMove(String typeMove) { this.typeMove = typeMove; }
	
	public String getTypeEating() { return typeEating; }
	public void setTypeEating(String typeEating) { this.typeEating = typeEating; }
	
	public Integer getPrice() { return Price; }
	public void setPrice(Integer Price) { this.Price = Price; }
	
	public String getTypeLiving() { return typeLiving; }
	public void setTypeLiving(String typeLiving) { this.typeLiving = typeLiving; }
	
	public String getDateTravel() { return dateTravel; }
	public void setDateTravel(String dateTravel) { this.dateTravel = dateTravel; }
	
	public String toString() {
        return "Акция! На тур \"" + nameTure + "\" в " + Country + ", город " + Town + " действует скидка 30%. Вас ждет увлекательное путешествие на " + 
        		typeMove + ", " + typeEating + " питание,  " + typeLiving + " в отеле! \nСпешите, стоймость  тура: " + Price + " руб. Дата отправления: " + dateTravel + " г.";
    }
}
