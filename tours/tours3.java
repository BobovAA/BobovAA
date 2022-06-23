package pi;

public class tours3 {
	private String nameExp;
	private String durationExp;
	private String typeLivingExp;
	
	public expTour(String nameTure, String typeEating, Integer Price, String dateTravel,String nameExp, String durationExp, String typeLivingExp) 
	{
		super(nameTure, typeEating, Price, dateTravel);
		this.nameExp = nameExp;
		this.typeLivingExp = typeLivingExp;
		this.durationExp = durationExp;
	}
	
	public String getNameExp() { return nameExp; }
	public void setNameExp(String nameExp) { this.nameExp = nameExp; }
	
	public String getTypeLivingExp() { return typeLivingExp; }
	public void setTypeLivingExp(String typeLivingExp) { this.typeLivingExp = typeLivingExp; }
	
	public String getDurationExp() { return durationExp; }
	public void setDurationExp(String durationExp) { this.durationExp = durationExp; }
	
	public String toString() {
        return "Название экспедиции: " + nameExp + "\n"
        		+ "Тип проживания: " + typeLivingExp + "\n"
        		+ "Длительность: "+ durationExp;
	}
}
