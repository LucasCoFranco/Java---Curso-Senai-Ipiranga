package primeiros.exercicios;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int nascimento = sc.nextInt();

        LocalDate data = LocalDate.now();
        DateTimeFormatter databr = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String datareal = data.format(databr);
        int ano = data.getYear();
        int idade = ano - nascimento;

        System.out.printf("Com a data de hoje %s você tem atualmente %d anos", datareal, idade);

        sc.close();
    }
}
