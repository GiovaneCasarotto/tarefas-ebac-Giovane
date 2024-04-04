import java.util.Scanner;

public class Conversao{

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        Integer num2 = numero;
        System.out.println("O número inteiro " + num2 + " foi convertido de int para o correspondente em wrapper!");
        
    }
}