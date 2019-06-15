package logika;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

class SplitText {
    static SortedSet<String> text(String s) {
        SortedSet<String> set = new TreeSet<>();
        return getString2(s, set);

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

//        String[] tmp = s.toLowerCase().replaceAll("[^А-яA-z]", " ").split(" | \n | u\00B6");
        Collections.addAll(set, s.split("\\W+"));
//        Collections.addAll(set, tmp);

        for (Iterator i = set.iterator(); i.hasNext(); ) {
            if (set.first().length() < 1) set.remove(set.first());
            else break;
        }

        System.out.println("Обработка выполнена");
        return (TreeSet<String>) set;
    }

    static SortedSet<String> getString2(String s, SortedSet<String> set) {
        long startTime = System.currentTimeMillis();
        String bufer = "";
        char[] c = s.toLowerCase().toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] > 'A' && c[i] < 'z') {
                bufer += c[i];
            } else if (bufer.length() == 0) {
                continue;
            } else {
                set.add(bufer);
                bufer = "";
            }
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
        return set;
    }
}
