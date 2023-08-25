package Modulo3.com.jornada.exercicio3;

public enum EnumEsportes {
    FUTEBOL("Futebol"), // 0
    BASQUETE("Basquete"), // 1
    NATACAO("Natação"), // 2
    JIUJITSU("Jiujitsu"), // 3
    VOLEI("Volei"), // 4
    CROSSFIT("Crossfit"); // 5

    private String nomeDoEsporte;

    EnumEsportes(String nomeDoEsporte) {
        this.nomeDoEsporte = nomeDoEsporte;
    }

    public String getNomeDoEsporte() {
        return this.nomeDoEsporte;
    }
}
