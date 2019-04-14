import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    private static int choice = 0;

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ссылку или текст:");
        String text = sc.nextLine();
        SortedSet<String> set = tst(text);
        System.out.println(set);
        SaveToFile.save(set);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }


    private static TreeSet<String> tst(String s) throws FileNotFoundException {
        File file = new File(s);
        if (file.isFile()) {
            return SplitText.textLink(s);
        } else {
            return SplitText.text(s);
        }
    }
}
