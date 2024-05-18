package primeiros.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos dias você ficou com o carro: ");
        int dias = sc.nextInt();

        System.out.println("Quantos Km você andou com o carro: ");
        double km = sc.nextDouble();

        double total = (dias * 86.75) + (km * 1.23);

        System.out.printf("Você irá pagar para a empresa R$%.2f pelo aluguel do carro",total);

        sc.close();
    }
}
