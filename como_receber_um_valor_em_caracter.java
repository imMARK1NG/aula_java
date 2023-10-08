import java.util.Scanner;

public class como_receber_um_valor_em_caracter {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int idade;
        System.out.println("INFORME SEU NOME:");
        String nome = n.nextLine(); //usar .nextLine quando for receber um valor em caracter.
        System.out.println("INFORME SUA IDADE:");
        idade = n.nextInt();
        System.out.println(nome+" tem "+  idade+" anos.");


    }
}
