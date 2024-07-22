package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FiltroIntervalo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

        List<Integer> numerosIntervalo = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        return nmr >= 5 && nmr <= 10;
                    }
                })
                .toList();

        System.out.println(numerosIntervalo);

    }
}
