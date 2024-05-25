package introducao;

import java.util.Scanner

import static java.lang.Integer.parseInt;

public class ExercicioDataSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia, resultado;

        System.out.println("Digite o dia da semana de hoje: ");
        dia = sc.nextLine();

        try {
            int numero = Integer.parseInt(dia);
            switch (numero){
                case 1:
                    resultado = "Domingo";
                    break;

                case 2:
                    resultado = "Segunda-feira";
                    break;

                case 3:
                    resultado = "Terça-feira";
                    break;

                case 4:
                    resultado = "Quarta-feira";
                    break;

                case 5:
                    resultado = "Quinta-feira";
                    break;

                case 6:
                    resultado = "Sexta-feira";
                    break;

                case 7:
                    resultado = "Sabado";
                    break;

                default:
                    System.out.println("Numero do dia irreconhecivel :/ ");
                    break;
            }
        } catch(NumberFormatException e) {

            if(dia.contains("Domingo")){
                resultado = "1"

            }
        }
    }
}
