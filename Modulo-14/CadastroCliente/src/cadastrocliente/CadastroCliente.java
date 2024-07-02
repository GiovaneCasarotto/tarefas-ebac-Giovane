package cadastrocliente;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Giovane
 */
public class CadastroCliente {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TabsJFrame frame = new TabsJFrame();
       //frame.setSize(600, 300);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true); //o metodo fica indisponivel se a classe originalmente nao extende Jframe
       frame.setResizable(false);
    }
}
