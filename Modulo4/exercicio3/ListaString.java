package Modulo4.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaString {
    public static void main(String[] args) {
        List<String> novaLista = receberString(); // passei o método receberString para o novaLista
        System.out.println(novaLista);
    }

    static List<String> receberString() {
        List<String> lista = new ArrayList<>();
        lista.add("Casa");
        lista.add("Carro");
        lista.add("Abacaxi");
        lista.add("Amora");
        lista.add("Amoeba");
        lista.add("Amarelo");
        lista.add("Churrasco");

        return lista.stream()
                .filter(n -> n.length() > 5 && n.startsWith("A"))// verifica se o tamanho da string é
                // maior que 5 e que começa com a letra A
                .sorted((String1, String2) -> String2.compareTo(String1)). // ordenar os elementos de uma lista em
                // ordem alfabética reversa (ou seja, de Z a A),
                collect(Collectors.toList());// usada para coletar os elementos de uma stream em uma nova lista.
    }

}
