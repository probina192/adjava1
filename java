import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите искомую подстроку: ");
        String secondString = scanner.nextLine();

        int count = 0;
        int index = firstString.indexOf(secondString);
        while (index != -1) {
            count++;
            index = firstString.indexOf(secondString, index + 1);
        }

        System.out.println("Количество вхождений: " + count);
    }
}
