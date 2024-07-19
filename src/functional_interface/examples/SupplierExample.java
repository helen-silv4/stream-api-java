package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    /**
     * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
     * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
     */

    public static void main(String[] args) {
        // usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // usar o Supplier para obter uma lista com 5 saudações
        //List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList(); //toList: colocando dentro da lista

        // passando o Supplier dentro do generate
        /* List<String> listaSaudacoes = Stream.generate(
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return "Olá, seja bem-vindo(a)!";
                    }
                }
        ).limit(5).toList();*/

        // simplificando com expressão Lambda
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        // imprimir as saudações geradas com expressão lambda
        listaSaudacoes.forEach(s -> System.out.println(s));

        // simplificando atráves do 'method reference'
        listaSaudacoes.forEach(System.out::println);
    }
}
