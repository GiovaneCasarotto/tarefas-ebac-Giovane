public class Dados{

    private String nome;

    private String sobrenome;

    private int idade;

    private double altura;

    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * 
     * @param args cadastra os dados do passinte
     */

    public void cadastrarNome(String nome) {
        setNome(nome);
    }
    public void cadastrarSobrenome(String sobrenome) {
        setSobrenome(sobrenome);
    }
    public void cadastrarIdade(int idade) {
        setIdade(idade);
    }
    public void cadastrarAltura(double altura) {
        setAltura(altura);
    }
    public void cadastrarPeso(double peso) {
        setPeso(peso);
    }
    
}
