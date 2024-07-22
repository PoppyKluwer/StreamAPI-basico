package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FindMaiorNumeroPrimo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

        int maiorNumeroPrimo = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        if (nmr <= 1) return false;
                        for (int i = 2; i * i <= nmr; i++) {
                            if (nmr % i == 0) return false;
                        }
                        return true;
                    }
                })
                .max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer n1, Integer n2) {
                        return n1.compareTo(n2);
                    }
                })
                .orElse(0);


        System.out.println("O maior número da lista é : " + maiorNumeroPrimo);
    }
}
