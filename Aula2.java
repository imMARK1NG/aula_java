import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int carro;
        int moto;

        System.out.println("você vem pra faculdade de carro?");
        carro = entrada.nextInt();

        System.out.println("você vem pra faculdade de moto?");
        moto = entrada.nextInt();

        if ((carro == 1 && moto ==2 ) || (carro == 2 && moto == 1)){
            System.out.println("você não pega onibus.");
        }
        else if (carro == 2 && moto == 2){
            System.out.println("você anda de onibus.");
            }
        else{
            System.out.println("valores errados");

        }
    }


}
