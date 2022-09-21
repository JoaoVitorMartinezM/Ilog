package semana02;

public class ex01 {
    public static void main(String[] args) {
        //01

        int[] array = {56, 57, 58 ,67, 99, 12, 11, 88};

        System.out.println(array[0]);
        System.out.println(array[7]);
        System.out.println(array[2]);


        //02
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        System.out.println(notas[2][0]);
        System.out.println(notas[3][1]);

        double soma = 0;
        for(int i = 0; i<4; i++){

            for(int j = 0; j<4; j++){
                soma += notas[i][j];

            }
            System.out.println(soma);
        }

        //03
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        for (int i = 0; i < extrato.length; i++) {
            System.out.println(extrato[i]);

        }
        for (int i = extrato.length -1; i >= 0; i--) {
            System.out.println(extrato[i]);

        }
        double valorTotal = 0;
        for (int i = 0; i < extrato.length; i++) {
            valorTotal += extrato[i];

        }
        System.out.println(valorTotal);

        if(valorTotal>=0){
            System.out.println("Saldo positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }




}
