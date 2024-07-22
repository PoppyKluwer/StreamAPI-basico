package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaiorNumero {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

        List<Integer> segundoMaiorNumero = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .toList();


        System.out.println("O segundo maior número é :" + segundoMaiorNumero);

    }

}
