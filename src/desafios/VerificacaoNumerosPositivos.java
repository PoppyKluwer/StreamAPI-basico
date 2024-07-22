package desafios;

import java.util.Arrays;
import java.util.List;

public class VerificacaoNumerosPositivos {
    public static void main(String[] args) {

        //TO DO: Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Stream
        /*
        boolean positivo = numeros.stream()
                .allMatch(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        if (nmr >= 0);
                        return true;
                    }
                });
                */

        //Stream + Lambda
        boolean positivo = numeros.stream()
                .allMatch(nmr -> nmr >= 0);

        System.out.println("Todos os números desta lista são posítivos ? \n" + positivo);
    }
}
