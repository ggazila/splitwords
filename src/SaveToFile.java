import java.util.Scanner;
import java.util.SortedSet;

public class SaveToFile {
    static void save(SortedSet<String> set) {
        Scanner sc = new Scanner(System.in);
        String nameFile = "";
        String extensionFile = "";
        System.out.println("Выберите имя файла");
        nameFile = sc.nextLine();
        System.out.println("Выберите расширение файла из списка:" +
                "\ntxt" +
                "\ndoc" +
                "\nxls");
    }
}
