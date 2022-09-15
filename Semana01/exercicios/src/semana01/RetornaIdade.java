package semana01;

import javax.swing.*;
import java.time.*;
import java.util.Date;


public class RetornaIdade {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));

        Date date = new Date();
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
        int anoAtual = getLocalDate.getYear();
        int idade = anoAtual-resposta;

        JOptionPane.showMessageDialog(null, "Sua idade é " + idade );
    }
}
