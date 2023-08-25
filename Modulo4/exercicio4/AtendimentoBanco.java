package Modulo4.exercicio4;

import java.util.LinkedList;
import java.util.Queue;

public class AtendimentoBanco {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Gabriel");
        queue.add("Anne");
        queue.add("Josiane");
        queue.add("Frederico");

        System.out.println("Fila de atendimento:" + queue);
        adicionarCliente(queue);
        System.out.println("Fila de atendimento atualizada:" + queue);
        removerCliente(queue);
        System.out.println("Esperando para o atendimento:" + TamanhoFila(queue) + " Pessoas");

    }

    static void adicionarCliente(Queue<String> queue) {
        queue.add("ANA MARIA");
        System.out.println("Cliente adicionado:" + "ANA MARIA");

    }

    static void removerCliente(Queue<String> queue) {
        String primeiroElemento = queue.poll();
        System.out.println("Cliente atendido:" + primeiroElemento);
    }

    static int TamanhoFila(Queue<String> queue) {
        return queue.size();
    }
}
