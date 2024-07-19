package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    /**
     * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
     * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
     * retornar um valor.
     */

    public static void main(String[] args) {
        // criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);

        // passando o Consumer dentro do forEach
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0){
                    System.out.println(n);
                }
            }
        });

        // simplificando com expressão Lambda
        numeros.forEach(n -> {
                if (n % 2 == 0){
                    System.out.println(n);
                }
            }
        );
    }
}
