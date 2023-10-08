import java.util.Scanner;

public class calculo_area_circulo {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        float raio_circulo;
        double calc;
        System.out.println("INFORME O RAIO DO CIRCULO:");
        raio_circulo = entrada.nextInt();
        calc = 3.14 * Math.pow(raio_circulo, 2);
        System.out.println(calc);
    }
}
