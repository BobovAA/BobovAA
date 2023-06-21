import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        int NumberCount = 0;
        int PunctCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isLetter(c) && !Character.isWhitespace(c) && !Character.isDigit(c)) {
                PunctCount++;
            }
            if (Character.isDigit(c)){
                NumberCount++;
            }
        }

        System.out.println("Количество знаков препинания в тексте: " + PunctCount);
        System.out.println("Количетсво цифр в тексте: " + NumberCount);
    }
}