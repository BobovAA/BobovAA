package pi;

public class task14 {
	static String login = "D117";
    static String Password = "qwerty";
	
    public static void main(String[] args) {
	    if ( (args[0].equals(login)) & (args[1].equals(Password)) ) 
	    {
	    	System.out.print("��� ������. ����� ����������!"); 
	    } 
	    else 
	    {
	        System.out.print("������ �� ����������. ������ ��������!"); 
	    }
    }
}
