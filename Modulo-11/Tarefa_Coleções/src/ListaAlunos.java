import java.util.*;


public class ListaAlunos {
    
    public static void main(String args[]) {
        System.out.println("Segue a lista de alunos\n_______________________________________________________________________________________________________________________\n");
        alunos();
        sexo();
    }

    private static void alunos() {
        
        Scanner nomes = new Scanner(System.in);

        System.out.println("Digite nomes separados por vírgula: ");
        String frase = nomes.nextLine();
        List lista = new ArrayList<String>(List.of(frase.split(", ")));


        System.out.println("Nomes digitados: "+ lista);
        Collections.sort(lista);
        System.out.println("Nomes digitados em ordem alfabética: " + lista + "\n_______________________________________________________________________________________________________________________\n");
        
    }
    
    private static void sexo() {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nomes e sexos (-m ou -f) separados por vírgula: ");
        String todosOsNomes = entrada.nextLine();
        System.out.println("String: " + todosOsNomes);

        String[] ArraytodosOsNomes = todosOsNomes.split(",");
        System.out.println("Array com todos os nomes:");
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
