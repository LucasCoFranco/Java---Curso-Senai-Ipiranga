package introducao;

import java.util.Scanner;

public class ExercicioIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String classificacao;
        System.out.printf("Por favor informe seu nome: ");
        String nome = sc.nextLine();
        System.out.printf("Informe seu peso: ");
        double peso = sc.nextDouble();
        System.out.printf("Agora %s precisamos da sua altura: ",nome);
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            classificacao = "MAGREZA";
        } else if(imc >= 18.5 && imc < 25){
            classificacao = "NORMAL";
        } else if(imc >= 25 && imc < 30){
            classificacao = "SOBREPESO";
        } else if(imc >= 30 && imc < 35){
            classificacao = "OBESIDADE GRAU 1";
        } else if(imc >= 35 && imc < 40){
            classificacao = "OBESIDADE GRAU 2";
        } else if(imc >= 40){
            classificacao = "OBESIDADE GRAU 3";
        } else {
            classificacao ="Valor fora do escopo";
        }

            System.out.printf("Obrigado por utilizar o programa, seu IMC é igual a %.1f e sua classificação é: %s", imc,classificacao);
    }
}
