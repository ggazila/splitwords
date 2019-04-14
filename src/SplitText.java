import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

class SplitText {
    static TreeSet<String> text(String s) {
        SortedSet<String> set = new TreeSet<>();
        return getStrings(s, set);

    }

    static TreeSet<String> textLink(String s) throws FileNotFoundException {
        SortedSet<String> set = new TreeSet<>();
        String c = "";
        BufferedReader fr = new BufferedReader(new FileReader(s));
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()) {
            c += sc.nextLine();
        }
        return getStrings(c, set);
    }

    private static TreeSet<String> getStrings(String s, SortedSet<String> set) {

        String[] tmp = s.toLowerCase().replaceAll("[^А-яA-z]", " ").split(" | \n");
        Collections.addAll(set, tmp);

        for (Iterator i = set.iterator(); i.hasNext(); ) {
            if (set.first().length() < 1) set.remove(set.first());
            else break;
        }


        //Test
//        System.out.println(set);
//        System.out.println(set.size());

        System.out.println("Обработка выполнена");
        return (TreeSet<String>) set;
    }
}
