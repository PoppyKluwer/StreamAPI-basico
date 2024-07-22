package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ValoresImpares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        //TO DO: Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console

        Map<String, List<Integer>> valoresImpares = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        return nmr % 3 == 0 || nmr % 5 == 0;
                    }
                })
                .collect(Collectors.groupingBy(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer nmr) {
                        return nmr % 3 == 0 ? "Multiplos de 3" : "Múltipos de 5";
                    }
                }));

        System.out.println(valoresImpares);
    }
}
