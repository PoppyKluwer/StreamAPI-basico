package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificacaoNumerosMaioresQue10 {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

        List<Integer> numerosMaioresQue10 = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                       return nmr > 10;
                    }
                })
                .toList();

        if (!numerosMaioresQue10.isEmpty()){
            System.out.println("A listá está vazia");
        }
        else {
            System.out.println("A listá está vazia");
        }
    }
}
