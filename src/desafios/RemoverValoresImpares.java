package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoverValoresImpares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

        List<Integer> numerosImpares = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        return nmr % 2 == 0;
                    }
                })
                .toList();

        System.out.println(numerosImpares);

    }
}
