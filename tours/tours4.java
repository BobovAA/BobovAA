package pi;

public class tours4 {
	private String Countrys;
	private String Towns;
	private String typeMove;
	private String typeLiving;
	private String durationTravel;
	
	public foreignTours(String nameTure, String typeEating, Integer Price, String dateTravel,String Countrys, String Towns, String typeMove, String typeLiving, String durationTravel) 
	{
		super(nameTure, typeEating, Price, dateTravel);
		this.Countrys = Countrys;
		this.Towns = Towns;
		this.typeMove = typeMove;
		this.typeLiving = typeLiving;
		this.durationTravel = durationTravel;
	}
	
	public String getCountrys() { return Countrys; }
	public void setCountrys(String Countrys) { this.Countrys = Countrys; }
	
	public String getTowns() { return Towns; }
	public void setTowns(String Towns) { this.Towns = Towns; }
	
	public String getTypeMove() { return typeMove; }
	public void setTypeMove(String typeMove) { this.typeMove = typeMove; }
	
	public String getTypeLiving() { return typeLiving; }
	public void setTypeLiving(String typeLiving) { this.typeLiving = typeLiving; }
	
	public String getDurationTravel() { return durationTravel; }
	public void setDurationTravel(String durationTravel) { this.durationTravel = durationTravel; }
	
	public String toString() {
        return "Страны: " + Countrys + "\n"
        		+ "Города: " + Towns + "\n"
        		+ "Тип передвижения: " + typeMove + "\n"
        		+ "Тип проживания: " + typeLiving + "\n"
        		+ "Длительность: "+ durationTravel;
    }
}
