package primeiros.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.printf("%s por favor, digite o seu RA: ",nome);
        String ra = sc.next();

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("Querido Aluno %s do RA %s sua média  foi igual a %.2f.%nObrigado pela atenção!",nome, ra, media);


    }
}
