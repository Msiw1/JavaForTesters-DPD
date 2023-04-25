package d_data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLists {

    public static void main(String[] args) {
        List<String> gwiezdneWojny = new ArrayList<>(Arrays.asList("Han Solo", "Luke Skywalker", "Darth Vader", "C-3PO", "Leia Organa","Obi Wan Kenobi"));

        System.out.println("Ostatni element listy: " + gwiezdneWojny.get(gwiezdneWojny.size()-1));

        for (int i = 0, j = gwiezdneWojny.size() - 1; i < j; i++) {
            gwiezdneWojny.add(i, gwiezdneWojny.remove(j));
        }

        for (String n : gwiezdneWojny){
            System.out.println("Postać z odwróconej listy: " + n);
        }

        Collections.sort(gwiezdneWojny);
        for (String n : gwiezdneWojny){
            System.out.println("Postać z posortowanej listy: " + n);
        }
        System.out.println("Pierwszy elementy z listy: " + gwiezdneWojny.get(0));

    }

}
