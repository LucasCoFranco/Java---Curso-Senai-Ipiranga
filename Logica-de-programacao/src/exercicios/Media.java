package exercicios;

public class Media {
    public static void main(String[]args){
        String gameRPG = "Hogwarts Legacy";
        String gameIndie = "Hollow Knight";

        int age = 35;
        int code = 2367;
        char gender = 'M';

        double priceRPG = 107.80;
        double priceIndie = 46.99;
        double media = ((priceRPG + priceIndie) / 2);

        System.out.println(gameRPG + ", está custando R$" + priceRPG);
        System.out.println(gameIndie + ", está custando R$" + priceIndie);
        System.out.println(" ");
        System.out.printf("O comprador tinha %d anos, code %d e genero: %s%n", age, code, gender);
        System.out.printf("Média de valor de R$ %f%n", media);
        System.out.printf("Média de valor de arrendondado: %.2f%n", media);
        System.out.println("Média de valor de arrendondado no padrão americano: " + media);
    }
}
