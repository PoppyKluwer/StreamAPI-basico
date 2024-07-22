package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificacaoNumeroNegativo {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //TO DO: Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

        List<Integer> numerosNegativos = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer nmr) {
                        if (nmr < 0){
                            return true;
                        }
                        return false;
                    }
                })
                .toList();

        if (!numerosNegativos.isEmpty()){
            System.out.println("Exisem os seguintes números negativos na lista :");
        }
        else {
            System.out.println("A lista está vazia! Não existem números negativos na lista");
        }

    }
}
