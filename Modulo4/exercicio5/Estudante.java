package Modulo4.exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Estudante {
    private String nome;
    private int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();
        Estudante estudantes1 = new Estudante("Gabriel", 20);
        Estudante estudantes2 = new Estudante("Edson", 10);
        Estudante estudantes3 = new Estudante("Sergio", 18);

        estudantes.add(estudantes1);
        estudantes.add(estudantes2); // add objetos Estudante a lista estudantes.
        estudantes.add(estudantes3);

        Optional<Estudante> alunoNovo = estudantes.stream()// criei uma stram de estudantes.
                .min((e1, e2) -> Integer.compare(e1.getIdade(), e2.getIdade()));// compara qual das idades é a menor

        if (alunoNovo.isPresent()) { // se o aluno é o mais novo executa
            Estudante maisNovo = alunoNovo.get();// passando o aluno mais novo para estudante mais novo
            System.out.println("Aluno mais novo: " + maisNovo.getNome() + "(" + maisNovo.getIdade() + ")anos");
        } else {
            System.out.println("A lista de estudantes está vazia.");
        }
    }
}
