package Modulo4.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProdutos {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();// defini o meu map

        map.put("Tênis", 3);
        map.put("Camisa", 4);
        map.put("Meia", 6);
        System.out.println("Map: " + map);

        adicionarProdutos(map, "Sunga", 9);
        System.out.println("Produto adicionado:" + map);

        removerProdutos(map, "Meia");
        System.out.println("Produto removido:" + map);

        int quantidade = verificarQuantidadeDisponivel(map, "Tênis");
        System.out.println("Quantidade de Tênis:" + quantidade);
    }

    static void adicionarProdutos(Map<String, Integer> map, String produto, int quantidade) {
        map.put(produto, quantidade);// passei a lista como paramentro para add os produtos
    }

    static void removerProdutos(Map<String, Integer> map, String produto) {
        map.remove(produto);
    }

    static int verificarQuantidadeDisponivel(Map<String, Integer> map, String produto) {
        return map.getOrDefault(produto, 0);
    }
}
