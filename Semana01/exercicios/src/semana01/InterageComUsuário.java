package semana01;
import javax.swing.*;
public class InterageComUsuário {

        public static void main(String[] args) {
            String resposta = JOptionPane.showInputDialog("Qual é o seu heroi favorito?");
            JOptionPane.showMessageDialog(null, "Seu herói favorito é " + resposta);
        }
    }


