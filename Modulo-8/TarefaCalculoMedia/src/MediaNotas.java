public class MediaNotas {

    public static void main(String args[]) {
        resultado(); 
    }
    
    public static void resultado() {

        double num1 = 8;

        double num2 = 7;

        double num3 = 3;

        double num4 = 5;

        double media = (num1 + num2 + num3 + num4) / 4;

        if (media < 7 && media >= 4){
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
