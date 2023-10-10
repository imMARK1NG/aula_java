import java.util.Random;
import java.util.Scanner;

public class PEDRA_PAPEL {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("VOCÊ QUER JOGAR JOKENPÔ?");
        System.out.println("QUANTOS PARTIDAS VOCE QUER JOGAR?");

        int partidas = n.nextInt();
        int contador = 0;

        while (partidas != contador) {
            int valor = aleatorio.nextInt(3) + 1;
            System.out.println("PC JÁ ESCOLHEU O QUE QUER JOGAR!");
            System.out.println("AGORA É SUA VEZ!");
            System.out.println("AGORA É SUA VEZ! (1 PEDRA || 2 PAPEL || 3 TESOURA)");

            int jogador = n.nextInt();

            if (jogador == 1) {
                System.out.println("VOCÊ JOGOU PEDRA!");
            } else if (jogador == 2) {
                System.out.println("VOCÊ JOGOU PAPEL!");
            } else if (jogador == 3) {
                System.out.println("VOCÊ JOGOU TESOURA!");
            } else {
                System.out.println("VALOR INVALIDO!");
                break;
            }
            if (valor == 1) {
                System.out.println("PC JOGOU PEDRA!");
            } else if (valor == 2) {
                System.out.println("PC JOGOU PAPEL!");
            } else if (valor == 3) {
                System.out.println("PC JOGOU TESOURA!");
            }

            if (valor == jogador) {
                System.out.println("DEU IMPATE!");
            } else if ((valor == 1) && (jogador == 2)) {
                System.out.println("VOCÊ VENCEU!");
            } else if ((valor == 1) && (jogador == 3)) {
                System.out.println("PC VENCEU!");
            } else if ((valor == 2) && (jogador == 1)) {
                System.out.println("PC VENCEU!");
            } else if ((valor == 2) && (jogador == 3)) {
                System.out.println("VOCÊ VENCEU!");
            }
            else if ((valor == 3) && (jogador == 2)) {
                System.out.println("VOCÊ VENCEU!");
            }
            else if ((valor == 3) && (jogador == 2)) {
                System.out.println("PC VENCEU!");
            }
            contador = contador + 1;



        }
    }
}