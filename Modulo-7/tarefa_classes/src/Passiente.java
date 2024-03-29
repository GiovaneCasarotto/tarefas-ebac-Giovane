public class Passiente {
    
    /**
     * 
     * @autor giovane.casarotto
     * 
     * 
     */
    public static void main(String args[]) {
        
        Dados dados = new Dados();
        dados.cadastrarNome("Ronaldo");
        dados.cadastrarSobrenome("Figueiredo");
        dados.cadastrarIdade(23);
        dados.cadastrarAltura(1.79);
        dados.cadastrarPeso(74.5);
        
        /**
         * 
         * @ escreve no console os dados do passiente
         * 
         * 
         */
        
        System.out.println("Segue os dados do passiente " + dados.getNome() + " " + dados.getSobrenome() + ".\n");
        System.out.println("Nome: " + dados.getNome());
        System.out.println("Sobrenome: " + dados.getSobrenome());
        System.out.println("Idade: " + dados.getIdade() + " anos");
        System.out.println("Altura: " + dados.getAltura() + " cm");
        System.out.println("Peso: " + dados.getPeso() + " Kg \n\n");
    }
    
}
