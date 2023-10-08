import java.util.Scanner;

public class mts_para_ctms {
    public static void main(String[] args) {
        int ctms;
        float conv;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INFORME EM MTS:");
        ctms = entrada.nextInt();
        conv = ctms * 100;
        System.out.println(conv+" CENTIMETROS.");



    }
}
