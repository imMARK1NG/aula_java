import java.util.Scanner;

public class Soma_entre_dois_numeros {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v1, v2, soma;
        System.out.println("INFORME O PRIMEIRO VALOR:");
        v1 = entrada.nextInt();
        System.out.println("INFOMER O SEGUNDO VALOR:");
        v2 = entrada.nextInt();

        soma = (v1+v2);

        System.out.println("A SOMA ENTRE V1+V2 É: " +soma);


    }
}
