package pi;

public class task24 {
	public static void main(String[] name) {
		final int n = 5;
		int a [] [] = new int[n][n];
		double SredGeom = 1, k = 0;
		
		System.out.println("��������� ������:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = (int) (Math.random() * 100 - 50);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("����������� ������� ��� ������� ����������:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(a[i][j] + "\t");
				if (a[i][j] > 0)
				{
					SredGeom *= a[i][j];
					k++;
				}
			}
			System.out.println();
		}
		
		SredGeom = Math.pow(SredGeom, 1/k);
		System.out.println("������� �������������� ������������� ���������: " + SredGeom);
/*		System.out.println("����������� ������������� �������� �����:");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Min[i] + "\t");
		}*/
}
}