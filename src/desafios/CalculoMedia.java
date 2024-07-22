package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class CalculoMedia {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        //Stream
        /*OptionalDouble media = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        return nmr > 5;
                    }
                })
                .mapToDouble(new ToDoubleFunction<Integer>() {
                    @Override
                    public double applyAsDouble(Integer value) {
                        return value;
                    }
                })
                .average();


        if (media.isPresent()) {
            System.out.println(media.getAsDouble());
        }*/

        //Stream + Lambda
        OptionalDouble media = numeros.stream()
                .filter( nmr -> nmr > 5)
                .mapToDouble(value -> value)
                .average();

        if (media.isPresent()){
            System.out.println(media.getAsDouble());
        }


    }
}
