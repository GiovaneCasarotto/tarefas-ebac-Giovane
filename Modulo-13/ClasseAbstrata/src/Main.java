public class Main {
    public static void main (String args[]) {
        System.out.println("\n==================================Pessoa Física:==================================");
        PessoaFisica[] pf = new PessoaFisica[2];
        pf[0] = new PessoaFisica();
        pf[0].setNome("Ricardo Moraes");
        pf[0].setIdade(36);
        pf[0].setCpf(12345678900l);
        pf[0].setSaldo(23000);
        pf[0].dadosPessoaFisica();

        pf[1] = new PessoaFisica();
        pf[1].setNome("Aline Souza");
        pf[1].setIdade(27);
        pf[1].setCpf(123876543212l);
        pf[1].setSaldo(7897);
        pf[1].dadosPessoaFisica();

        System.out.println("\n==================================Pessoa Jurídica:==================================");
        PessoaJuridica[] pj = new PessoaJuridica[2];
        pj[0] = new PessoaJuridica();
        pj[0].setCnpj(1222333000144l);
        pj[0].setNome("Danilo Garcia");
        pj[0].setIdade(59);
        pj[0].setNomeEmpre("Exemplo ltda");
        pj[0].setSaldo(3543000);
        pj[0].dadosPessoaJuridica();
        
        pj[1] = new PessoaJuridica();
        pj[1].setCnpj(872653000178l);
        pj[1].setNome("Tales Marcos");
        pj[1].setIdade(59);
        pj[1].setNomeEmpre("Teste ltda");
        pj[1].setSaldo(4563210);
        pj[1].dadosPessoaJuridica();
    }
}
