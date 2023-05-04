package e_functions;

import java.util.List;
import java.util.stream.IntStream;

public class NamesStream {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> numbers = IntStream.range(1, n+1).boxed().toList();
        System.out.println("Pierwsza lista: ");
        numbers.forEach(System.out::println);

        System.out.println("Druga lista: ");
        List<Double> squared = numbers.stream()
                .map(m -> Math.pow(m, 2))
                .toList();
        squared.forEach(System.out::println);



    }
}
