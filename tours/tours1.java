package pi;

import java.util.ArrayList;

public class tours1 {
	private ArrayList<Tour> listOfTour;

	public Main(ArrayList<Tour> listOfTour) {
		this.listOfTour = listOfTour;
	}
	
	public void addTour(Tour tour) {
		listOfTour.add(tour);
	}
	
	public ArrayList<Tour> printTour() {
		return listOfTour;
	}
	
	public static void main(String[] args) {
		ArrayList<Tour> listOfTour = new ArrayList<>();
		Main main = new Main(listOfTour);
		
		String nameTure = "Туманный альбион";
		String typeEating = "Трехразовое питание";
		Integer Price = 56000;
		String dateTravel = "26.06.2022"; 
	    
		String Countrys = "Британия, Канада";
		String Towns = "Лондон, Торонто";
		String typeMove = "Самолет";
		String typeLiving = "Отель";
		String durationTravel = "13 дней, 14 ночей"; 
		foreignTours foreignTours = new foreignTours(nameTure, typeEating, Price, dateTravel,Countrys, Towns, typeMove, typeLiving, durationTravel);
		main.addTour(foreignTours);
		
		String nameExp = "Покорение Дона";
		String durationExp = "7 дней, 6 ночей";
		String typeLivingExp = "Палаточный лагерь";
		expTour expTour = new expTour(nameTure, typeEating, Price, dateTravel, nameExp, durationExp, typeLivingExp);
		main.addTour(expTour);
		
		String nameEvent = "Экстремальный отдых";
		String Town = "Воронеж";
		String typePart = "Участник";
		String typeLivingEdu = "Домики с комфортабельными условиями";
		phuEduTour phuEduTour = new phuEduTour(nameTure, typeEating, Price, dateTravel, nameEvent, Town, typePart, typeLivingEdu);
		main.addTour(phuEduTour);
		
		System.out.print(main.printTour());
	}
}