package Modulo4.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaDeInteiros {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();// Lista de inteiros
        lista.add(1);
        lista.add(2);
        lista.add(3);// add valores a lista
        lista.add(4);
        lista.add(5);
        System.out.println("Números presentes na lista: " + lista);

        int soma = somaInteiros(lista);// passei a soma da lista para a variavel
        System.out.println("A soma dos pares é:" + soma);

    }

    static int somaInteiros(List<Integer> lista) {
        return lista.stream()
                .filter(n -> n % 2 == 0)// filtrar se os numeros são pares
                .mapToInt(Integer::intValue)// passando Integer para dado primitivo int
                .sum();// calcula a soma

    }
}
