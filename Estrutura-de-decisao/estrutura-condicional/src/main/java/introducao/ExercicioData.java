package introducao;

import java.util.Scanner;
public class ExercicioData {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.println("Digite o dia da semana de hoje: ");
        dia = sc.nextLine();

        try {
            int numero = Integer.parseInt(dia);
            if (numero == "2") {
                System.out.println("Hoje é Segunda-feira, boa semana");
            } else if (dia == "3") {
                System.out.println("Hoje é Terça-feira, boa semana");
            } else if (dia == "4") {
                System.out.println("Hoje é Quarta-feira, boa semana");
            } else if (dia == "5") {
                System.out.println("Hoje é Quinta-feira, boa semana");
            } else if (dia == "6") {
                System.out.println("Hoje é Sexta-feira, boa semana");
                System.out.println("Ufaaa!! Estamos no fim!! ^-^");
            } else if (dia == "7") {
                System.out.println("Hoje é Sabado, bom fim de semana");
            } else if (dia == "1") {
                System.out.println("Hoje é Domingo, Domingo a noite :(");
            } else {
                System.out.println("Numero do dia irreconhecivel :/ ");
            }
        } catch ()
        sc.close();
    }
}
