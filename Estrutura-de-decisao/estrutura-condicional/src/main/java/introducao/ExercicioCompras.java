package introducao;

import java.util.Scanner;

public class ExercicioCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("||---------||--------||--------");
        System.out.println("|| Código  ||  Item  ||  Valor");
        System.out.println("||  1   ||  Mc Lanche Feliz  ||  R$27,90");
        System.out.println("||  15  ||  Panqueca  ||  R$10,55");
        System.out.println("||  32  ||  Waffle  ||  R$8,99");
        System.out.println("||  25  ||  Chocotone  ||  R$15,22");
        System.out.println("||  46  ||  Java Coffee  ||  R$12,30");
        System.out.println("||  2   ||  Whopper  ||  R$15,00");
        System.out.print("Digite a sua escolha: ");
        int escolha = sc.nextInt();
        System.out.printf("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        if(escolha == 1){
            double valor = 27.90 * quantidade;
            System.out.printf("O item Mc Lanche Feliz comprando %d unidades, sairá por R$%.2f", quantidade, valor);
        } else if(escolha == 15){
            double valor = 10.55 * quantidade;
            System.out.printf("O item Panqueca comprando %d unidades, sairá por R$%.2f", quantidade, valor);
        } else if(escolha == 32){
            double valor = 8.99 * quantidade;
            System.out.printf("O item Waffle comprando %d unidades, sairá por R$%.2f", quantidade, valor);
        } else if(escolha == 25){
            double valor = 15.22 * quantidade;
            System.out.printf("O item Chocotone comprando %d unidades, sairá por R$%.2f", quantidade, valor);
        } else if(escolha == 46){
            double valor = 12.30 * quantidade;
            System.out.printf("O item Java Coffee comprando %d unidades, sairá por R$%.2f", quantidade, valor);
        } else if(escolha == 2){
            double valor = 15.00 * quantidade;
            System.out.printf("O item Whopper comprando %d unidades, sairá por R$%.2f", quantidade, valor);
        } else {
            System.out.printf("Código sem item associado!");
        }
        sc.close();
    }
}
