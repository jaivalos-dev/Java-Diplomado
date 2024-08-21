package Ejercicios;

public class MatrizLlenadaAleatorio {
    public static void main(String[] args){

        double numeros[][] = new double[5][4];
        double aleatorio = 0;

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                numeros[i][j] = Math.ceil((Math.random()*100));
                System.out.print(" | " + numeros[i][j]);
            }
            System.out.println(" |");
        }


    }
}
