package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class SomaNumerosDivisiveisPor3e5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

        int soma = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        return (nmr % 5 == 0) && (nmr % 3 == 0);
                    }
                })
                .mapToInt(new ToIntFunction<Integer>() {
                    @Override
                    public int applyAsInt(Integer value) {
                        return value;
                    }
                })
                .sum();

        System.out.println(soma);

    }
}
