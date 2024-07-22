package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindNumerosPrimos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

        List<Integer> numerosPrimos = numeros.stream()
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
                .toList();

        System.out.println("São os números primos: " + numerosPrimos);
    }
}
