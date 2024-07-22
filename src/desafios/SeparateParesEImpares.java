package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SeparateParesEImpares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

        Map<String, List<Integer>> paresEImpares = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        return nmr % 2 == 0 || nmr % 2 != 0;
                    }
                })
                .collect(Collectors.groupingBy(new Function<Integer, String>() {
                    @Override
                        public String apply(Integer nmr) {
                        return nmr % 2 == 0 ? "Números Pares" : "Números Impares";
                    }
                }));

        System.out.println(paresEImpares);

    }
}
