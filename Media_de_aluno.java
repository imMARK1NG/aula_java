import java.util.Scanner;

public class Media_de_aluno {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int n1, n2, n3, media;

    System.out.println("INFORME A PRIMEIRA NOTA:");
    n1 = entrada.nextInt();
    System.out.println("INFORME O SEGUNDO VALOR:");
    n2 = entrada.nextInt();
    System.out.println("INFORME O TERCEIRO VALOR:");
    n3 = entrada.nextInt();

    media = (n1 + n2 + n3)/3;

    System.out.println("A MEDIA DO ALUNO É: "+ media);



}

    }