package primeiros.exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome para cadastro: ");
        String nome = sc.nextLine();

        int cont = nome.length();

        System.out.println("Digite a sua idade: ");
        byte idade = sc.nextByte();
        sc.nextLine();

        System.out.println("Digite seu gênero: [M/F]");
        String texto = sc.nextLine();
        char genero = texto.toUpperCase().charAt(0);

//        String RA = nome.charAt(0) + String.valueOf(rd.nextInt(900) + 100); //Deste modo, o compilador dará conflito pois ele está tentando ler um char sendo uma string
        String RA = nome.substring(0,1) + rd.nextInt(100);
        System.out.println("Digite seu curso: ");
        String curso = sc.nextLine();

        /*System.out.printf("Seu nome é %s e ele possui %s letras, sua idade é %d seu gênero é %ss " +
                "%nVocê se inscreveu no curso de %s com o RA %s",
                nome.toUpperCase(), nome.length(), idade, genero, curso.toLowerCase(), RA);*/

        System.out.printf("Seu nome é %s e ele possui %d letras, sua idade é %d, seu gênero é %s%n", nome, cont, idade, genero);
        System.out.printf("Você se inscreveu no curso de %s com o RA %d", curso, RA);

        sc.close();
    }
}
