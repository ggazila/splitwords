package logika;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;

public class SaveToFile {
    static void save(SortedSet<String> set) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nameFile = "";
        String extensionFile = "";
        System.out.println("Выберите имя файла");
        nameFile = sc.nextLine();
        System.out.println("Выберите расширение файла из списка:" +
                "\ntxt" +
                "\ndoc" +
                "\nxls");
        extensionFile = sc.nextLine();
        String fileName = nameFile + "." + extensionFile;
        saveFile(fileName, set);

    }

    private static void saveFile(String file, SortedSet<String> set) throws IOException {

        BufferedWriter reader = new BufferedWriter(new FileWriter(file));

        for (String s :
                set) {
            reader.write(s + "\n");
        }

        reader.close();
    }
}
