package semana01;

public class CalculaPontos {
    public static void main(String[] args) {
        int vitoria = 3;
        int derrota = 0;
        int empate = 1;
        int partidas = 20;
        String time = "Tabajara F.C.";

        int pontos = (vitoria*12)+(derrota*2)+(empate*6);

        System.out.println("O time " + time+ " acumulou " + pontos +" pontos após jogar "+ partidas +" partidas");

    }

}
