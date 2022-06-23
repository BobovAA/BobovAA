package pi;

public class tours5 {
	private String nameEvent;
	private String Town;
	private String typePart;
	private String typeLivingEdu;
	
	public phuEduTour(String nameTure, String typeEating, Integer Price, String dateTravel, String nameEvent, String Town, String typePart, String typeLivingEdu) 
	{
		super(nameTure, typeEating, Price, dateTravel);
		this.nameEvent = nameEvent;
		this.typeLivingEdu = typeLivingEdu;
		this.Town = Town;
		this.typePart = typePart;
	}
	
	public String getNameEvent() { return nameEvent; }
	public void setNameEvent(String nameEvent) { this.nameEvent = nameEvent; }
	
	public String getTypeLivingEdu() { return typeLivingEdu; }
	public void setTypeLivingEdu(String typeLivingEdu) { this.typeLivingEdu = typeLivingEdu; }
	
	public String getTown() { return Town; }
	public void setTown(String Town) { this.Town = Town; }
	
	public String getTypePart() { return typePart; }
	public void setTypePart(String typePart) { this.typePart = typePart; }
	
	public String toString() {
        return "Спортивное мероприятие: " + nameEvent + "\n"
        		+ "Город: " + Town + "\n"
        		+ "Тип участия: "+ typePart + "\n"
        		+ "Тип проживания: "+ typeLivingEdu;
	}
}
