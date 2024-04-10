import java.util.*;


public class ListaAlunos {
    
    public static void main(String args[]) {
        sexo();
    }
    
    private static void sexo() {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: \n");
        String todosOsNomes = entrada.nextLine();
        System.out.println("String: " + todosOsNomes + "\n");

        String[] ArraytodosOsNomes = todosOsNomes.split(",");
        System.out.println("Array com todos os nomes:\n");
        System.out.println(Arrays.toString(ArraytodosOsNomes));

        for (String s : ArraytodosOsNomes) {
            String nome = s.trim();
            if (nome.endsWith("-m")) {
                System.out.println("Nome: " + nome.substring(0, nome.length() - 2) + ", Sexo: Masculino");
            } else if (nome.endsWith("-f")) {
                System.out.println("Nome: " + nome.substring(0, nome.length() - 2) + ", Sexo: Feminino");
            } else {
                System.out.println("Nome: " + nome + ", Sexo: Indefinido");
            }
        }
    }
}
