package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class SomaDosQuadrados {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        //TO DO : Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.


        int somaDosQuadrados = numeros.stream()
                .mapToInt(new ToIntFunction<Integer>() {
                    @Override
                    public int applyAsInt(Integer nmr) {
                        return (int) Math.pow(nmr, 2);
                    }
                })
                .sum();



        System.out.println("A soma é: " + somaDosQuadrados);
    }
}
