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
