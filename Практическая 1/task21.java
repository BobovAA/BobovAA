package pi;

public class task21 {
	static int cont;
	static int ind;
	
	public static void main(String[] name) {
		int mas [] = new int[10];
		int Max = -10; 
		
		System.out.println("���������� ������:");
		for (int i = 0; i < 10; i++)
		{
			mas[i] = (int) (Math.random() * 100 - 50);
			System.out.print(mas[i] + " ");
			if (mas[i] >= Max)
			{
				Max = mas[i];
				ind = i;
			}
		}
		
		cont = mas[0];
		mas[0] = Max;
		mas[ind] = cont;
		
		System.out.println();
		
		System.out.println("���������� ���������� ������:");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(mas[i] + " ");
		}
}
}
