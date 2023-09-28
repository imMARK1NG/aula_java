

import java.util.Scanner;
public class Aula{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int soma;
        int diferenca;
        int mult;
        int divi;
        double pontencia;
        int resto;
        System.out.println("DIGITE O VALOR DE N1:");
        n1 = entrada.nextInt();
        System.out.println("DIGITE O VALOR DE N2:");
        n2 = entrada.nextInt();

        soma = n1+n2;
        System.out.println("O VALOR DA SOMA É IGUAL: " + soma);
        diferenca = n1 - n2;
        System.out.println("A DIFERENÇA É IGUAL: " + diferenca);
        mult = n1 * n2;
        System.out.println("A MULT É IGUAL A: " + mult);
        divi = n1 / n2;
        System.out.println("A DIVISÃO É IGUAL A: " + divi);
        resto = n1 % n2;
        System.out.println("O RESTO É IGUAL A:" + resto);
        pontencia = Math.pow(n1, n2);
        System.out.println("A POTENCIA É IGUAL A:" + pontencia);
    }
}
