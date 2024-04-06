import java.util.Scanner;

public class MediaNotas {

    public static void main(String args[]) {
        resultado(); 
    }
    
    public static void resultado() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota das quatro provas em sequencia: ");   
        
        double num1 = scanner.nextInt();

        double num2 = scanner.nextInt();

        double num3 = scanner.nextInt();

        double num4 = scanner.nextInt();

        double media = (num1 + num2 + num3 + num4) / 4;

        if (media < 7 && media >= 5){
            System.out.println("\n\n_______________________________________________________________________________________________________________________________\n\n" + "Sua média é " + media + ", infelizmente você não atingiu a média, mas ainda pode fazer a prova de recuperação, boa sorte!" + "\n\n_______________________________________________________________________________________________________________________________\n\n");
        }
        else if (media >= 7){
            System.out.println("\n\n_______________________________________________________________________________________________________________________________\n\n" + "Sua média é " + media + ", parabéns você foi aprovado!" + "\n\n_______________________________________________________________________________________________________________________________\n\n");
        }
        else {
            System.out.println("\n\n_______________________________________________________________________________________________________________________________\n\n" + "Sua média é " + media + ", infelizmente você não atingiu a média e nem o valor necessário para a recuperação." + "\n\n_______________________________________________________________________________________________________________________________\n\n");
        }
        
    }
    
}
