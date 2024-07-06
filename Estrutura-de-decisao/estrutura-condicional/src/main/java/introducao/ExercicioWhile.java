import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();

            if (nome.toLowerCase().equals("sair")) {
                break;
            }

            System.out.printf("Seja Bem-Vindo %s fico feliz por ter você aqui\n", nome);
        }
    }
}

/**==============================================================================================================
Outra maneira de fazer*//
//!!!!IMPORTATE!!!!!!!!!
// o do while não aceita comparações do tipo == ou !=, então para querer utilizar nessas condições, será necessário usar ! ou equals
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);
            do{
                System.out.print("Digite o seu nome: ");
                nome = sc.nextLine().toLowerCase();
                System.out.printf("Seja Bem-Vindo %s fico feliz por ter voce aqui\n",nome);
            } while (!nome.equals("sair"));

        }
    }

//não recomendado, pois ele falará seja bem-vindo ao sair 
