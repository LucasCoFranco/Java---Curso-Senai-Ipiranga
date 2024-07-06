//Exercicio para entendimento de adivinhação de um numero aleatorio 
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int cont = 0;
        System.out.print("Digite o range do número de adivinhação: ");
        int num = sc.nextInt();
        int sorteado = rd.nextInt(num);
        while(true){
            System.out.println("Tente adivinhar o número sorteado: ");
            int resposta = sc.nextInt();
            cont++;
            if (resposta == sorteado){
                System.out.println("ACERTOU!!!");
                System.out.printf("Você acertou o número %d em apenas %d tentativas",sorteado,cont);
                break;
            }
        }



        }
    }
