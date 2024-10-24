import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("SSDsa");
        list.add("Sfww");
        list.add("sd");

        Iterator<String> iterator = list.iterator();

      while (iterator.hasNext()) {
    String elements = iterator.next();
    System.out.println(elements);
    }
    }
}