package Modulo1.Exercicio2;

//  Crie uma classe base chamada "Animal" que possua atributos como nome, idade e som (o som que ele emite),
//  por fim crie um método chamado "emitirSom" que imprima um som genérico. Em seguida, crie um objeto 
//  "cachorro", "gato" e "pássaro", que são do tipo Animal. Cada objeto tem um som diferente, atribua os sons 
//  aos objetos e chame o método emitirSom para ver qual som cada objeto faz.
public class Animal {
    String nome;
    int idade;
    String som;

    void emitirSom() {
        System.out.println("O som do " + nome + (" é ") + som);
    }

}
