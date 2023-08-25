package Modulo3.com.jornada.exercicio3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        EnumEsportes[] esportesArray = EnumEsportes.values();

        String[] esportesArray1 = {
                "[0] Futebol",
                "[1] Basquete",
                "[2] Natação",
                "[3] Jiujitsu",
                "[4] Vôlei",
                "[5] Crossfit", };

        System.out.println("Esportes disponíveis:");
        for (int i = 0; i < esportesArray.length; i++) {
            System.out.println(i + ": " + esportesArray[i]);
        }

        System.out.print("\nEscolha um esporte:");
        int escolha = ler.nextInt();

        if (escolha >= 0 && escolha < EnumEsportes.values().length) {
            EnumEsportes esportes = EnumEsportes.values()[escolha];

            switch (escolha) {
                case 0:
                    System.out.println(esportes + "Usa Bola:" + "Um dos esportes mais conhecidos no mundo:");
                    break;
                case 1:
                    System.out.println(esportes + "Usa  bola" + "Jogo que exige muita resistência:!!");
                    break;
                case 2:
                    System.out.println(
                            esportes + " Não usa Bola:" + " Esporte que precisa controlar a respiração e ser veloz");
                    break;
                case 3:
                    System.out.println(esportes + "Não usa Bola:" + " Esporte extramamente violento");
                    break;
                case 4:
                    System.out.println(esportes + "Usa Bola:" + "Jogos de até  6 pessoas,");
                    break;
                case 5:
                    System.out.println(
                            esportes + " Não usa Bola:" + "Atividade fisica explosiva, com muitos movimentos!!");
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Escolha Invalida\n" + "Escolha Novamente:");
            escolha = ler.nextInt();
        }
    }
}
