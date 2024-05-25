package introducao;

import java.util.Scanner;

public class ExercicioPlanoCelular {
    public static void main(String []agrs){
        double plano = 79.30;
        double excedente = 2.30;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos minutos você utilizou: ");
        int minutos = sc.nextInt();

        if (minutos > 100){
            plano += (minutos - 100) * excedente;
            System.out.printf("Valor da conta = %.2f", plano);
        } else {
            System.out.printf("Valor da conta = %.2f", plano);
        }
        sc.close();
    }
}
