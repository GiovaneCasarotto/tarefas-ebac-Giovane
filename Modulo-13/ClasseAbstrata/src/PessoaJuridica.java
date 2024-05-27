public class PessoaJuridica extends Pessoa {
    private String nomeEmpre;
    private Long cnpj;
    
    public String getNomeEmpre() {
        return nomeEmpre;
    }
    public void setNomeEmpre(String nomeEmpre) {
        this.nomeEmpre = nomeEmpre;
    }
    public Long getCnpj() {
        return cnpj;
    }
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
    
    public void dadosPessoaJuridica() {
        System.out.println("\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nEmpresa: " + this.getNomeEmpre() + "\nCnpj: " + this.getCnpj() + "\nSaldo: " + this.getSaldo());
    }
}
