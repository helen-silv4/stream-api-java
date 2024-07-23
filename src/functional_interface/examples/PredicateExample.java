package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {
        // criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaractes = palavra -> palavra.length() > 5;

        // usar o Stream para filtrar as palavras com mais de 5 caracters e, em seguida,
        // imprimir cada palavra que passou pelo filtro
        palavras.stream()
                .filter(maisDeCincoCaractes)
                .forEach(System.out::println);

        // passando o Predicate dentro do stream
        palavras.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String p) {
                        return p.length() > 5;
                    }
                })
                .forEach(System.out::println);

        // simplificando com expressão Lambda
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
