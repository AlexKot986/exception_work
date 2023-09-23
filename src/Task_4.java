import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        message();
    }
    public static void message() {
        System.out.print("Текст сообщения --> ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.nextLine().length() == 0) {
            throw new RuntimeException("пустые строки вводить нельзя");
        }
        System.out.println("ok");
    }
}
