package program;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Lists do not accept primitive types, just wrapper classes:
        List<String> list = new ArrayList<String>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        for (String i : list) {
            System.out.println(i);
        }

        // add in specific position:
        System.out.println();
        list.add(2, "Marco");

        for (String i : list) {
            System.out.println(i);
        }

        // call list size:
        System.out.println();
        System.out.println(list.size());

        // remove items from list:
        list.remove("Ana");
        System.out.println();
        for (String i : list) {
            System.out.println(i);
        }

        // remove item by index
        list.remove(1);
        System.out.println();
        for (String i : list) {
            System.out.println(i);
        }

        // remove item with lambda sentence:
        list.removeIf(x -> Character.toUpperCase(x.charAt(0)) == 'M');
        System.out.println();

    }
}
