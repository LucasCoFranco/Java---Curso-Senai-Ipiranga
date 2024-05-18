package primeiros.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Graus Celsius: ");
        double grausC = sc.nextDouble();
        double grausF = (grausC * 9/5) + 32;
        double grausK = grausC + 273.15;
        double grausRe = grausC * 0.8;
        double grausRa = grausC * 9/5 + 491.67;

        System.out.printf("A temperatura %.1f em Fahrenheit é igual a %.1f%n", grausC, grausF);
        System.out.printf("A temperatura %.1f em Kelvin é igual a %.1f%n", grausC, grausK);
        System.out.printf("A temperatura %.1f em Réaumur é igual a %.1f%n", grausC, grausRe);
        System.out.printf("A temperatura %.1f em Rankine é igual a %.1f%n", grausC, grausRa);

        sc.close();
    }
}
