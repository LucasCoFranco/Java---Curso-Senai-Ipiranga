package primeiros.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2PadraoUS {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Raio para calcularmos a área: " );
        double raio = sc.nextDouble();
        final double pi = 3.1415;

        double area = pi * (raio * raio);
        System.out.printf("A área do círculo com raio de %.2f é igual a %.2f%n", raio, area);

        sc.close();
    }
}
