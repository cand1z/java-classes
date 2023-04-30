package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        for (String i : list) {
            System.out.println(i);
        }

        // discover position of an item:
        System.out.println();
        System.out.println("Position of Bob: "+ list.indexOf("Bob"));

        System.out.println();
        list.add("Alex");
        list.add("Ana");

        // filter that say only the person that begins with A
        System.out.println();
        List<String> result = list.stream().filter(i -> Character.toUpperCase(i.charAt(0)) == 'A').toList();
        for (String i : result) {
            System.out.println(i);
        }

        // filter the first list item
        System.out.println();
        String name = list.stream().filter(i -> Character.toUpperCase(i.charAt(0)) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
