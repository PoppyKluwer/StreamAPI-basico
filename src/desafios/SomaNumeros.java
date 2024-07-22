package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SomaNumeros {
    public static void main(String[] args) {

    //TO DO: Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    int resultado = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer nmr1, Integer nmr2) {
                        return nmr1 + nmr2;
                    }
                });

    System.out.println(resultado);

    }
}