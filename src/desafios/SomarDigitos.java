package desafios;

import java.util.Arrays;
import java.util.List;

public class SomarDigitos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

        int somaDosDigitos = numeros.stream()
                .map(n -> String.valueOf(n)) 
                .mapToInt(s -> {
                    int sum = 0;
                    for (char c : s.toCharArray()) {
                        sum += c - '0';
                    }
                    return sum;
                })
                .sum();

        System.out.println("A soma dos dígitos é: " + somaDosDigitos);


    }
}
