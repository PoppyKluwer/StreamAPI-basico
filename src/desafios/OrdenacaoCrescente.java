package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoCrescente {
    public static void main(String[] args) {

        // to do : Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmOrdemCrescente = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosEmOrdemCrescente);


    }
}
