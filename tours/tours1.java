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
		
		String nameTure = "�������� �������";
		String typeEating = "����������� �������";
		Integer Price = 56000;
		String dateTravel = "26.06.2022"; 
	    
		String Countrys = "��������, ������";
		String Towns = "������, �������";
		String typeMove = "�������";
		String typeLiving = "�����";
		String durationTravel = "13 ����, 14 �����"; 
		foreignTours foreignTours = new foreignTours(nameTure, typeEating, Price, dateTravel,Countrys, Towns, typeMove, typeLiving, durationTravel);
		main.addTour(foreignTours);
		
		String nameExp = "��������� ����";
		String durationExp = "7 ����, 6 �����";
		String typeLivingExp = "���������� ������";
		expTour expTour = new expTour(nameTure, typeEating, Price, dateTravel, nameExp, durationExp, typeLivingExp);
		main.addTour(expTour);
		
		String nameEvent = "������������� �����";
		String Town = "�������";
		String typePart = "��������";
		String typeLivingEdu = "������ � ���������������� ���������";
		phuEduTour phuEduTour = new phuEduTour(nameTure, typeEating, Price, dateTravel, nameEvent, Town, typePart, typeLivingEdu);
		main.addTour(phuEduTour);
		
		System.out.print(main.printTour());
	}
}