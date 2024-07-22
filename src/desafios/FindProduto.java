package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FindProduto {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //TO DO: Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

        List<Integer> produtos = numeros.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer nmr) {
                        return nmr * nmr;
                    }
                })
                .toList();

        System.out.println(produtos);

    }
}
