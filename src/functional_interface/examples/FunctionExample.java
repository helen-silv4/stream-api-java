package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
     * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
     */

    public static void main(String[] args) {
        // criar uma lista com números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usar a Function com expressão Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        /*

        //usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        //passando a Function dentro do stream
        List<Integer> numerosDobrados = numeros.stream()
                .map(
                        new Function<Integer, Integer>() {
                            @Override
                            public Integer apply(Integer n) {
                                return n * 2;
                            }
                        }
                )
                .toList();
         */

        // simplificando com expressão Lambda
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // imprimir a lista com números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));

        // simplificando atráves do 'method reference'
        numerosDobrados.forEach(System.out::println);
    }
}
