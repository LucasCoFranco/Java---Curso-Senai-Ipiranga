package introducao;

public class EstruturaDeDecisao {
    public static void main(String[]args){
        double n1, n2, n3, media;

        n1 = 7.0;
        n2 = 7.0;
        n3 = 7.0;

        media = (n1 + n2 + n3) / 3.0;

        if (media > 7.0){
            System.out.printf("Sua media foi %.1f e você foi APROVADO%n", media);
        } else if (media > 5.0 && media < 7.0){
            System.out.printf("Sua media foi %.1f e você está de recuperação%n", media);
        } else{
            System.out.printf("Sua media foi %.1f e você foi REPROVADO%n", media);
        }

        System.out.println("Muito obrigado por tirar a media conosco!");
    }
}
