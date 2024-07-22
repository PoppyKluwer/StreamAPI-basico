package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumerosIguais {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

        boolean numerosIguais = numeros.stream()
                        .allMatch(new Predicate<Integer>() {
                            @Override
                            public boolean test(Integer nmr) {
                                return numeros.get(nmr).equals(nmr);
                            }
                        });


        System.out.println("Todos os números na lista são iguais? " + numerosIguais);

    }
}
