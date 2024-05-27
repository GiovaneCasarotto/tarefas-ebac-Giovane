public class PessoaFisica extends Pessoa {
    private Long cpf;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public void dadosPessoaFisica() {
        System.out.println("\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nCpf: " + this.getCpf() + "\nSaldo: " + this.getSaldo());
    }
}
