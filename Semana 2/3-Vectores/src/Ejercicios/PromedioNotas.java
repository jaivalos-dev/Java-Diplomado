package Ejercicios;

public class PromedioNotas {
    public static void  main(String[] args){
        double porcentaje[] = {20, 10, 30, 20, 20};
        double promedio = 0;
        double notas[] = new double[5];
        notas[0] = 90;
        notas[1] = 50;
        notas[2] = 80;
        notas[3] = 68;
        notas[4] = 94;

        for (int i = 0; i < notas.length; i++){
            promedio += (notas[i] * ( porcentaje[i] / 100 ) );
        }

        System.out.println("El promedio de las notas es: " + promedio);

    }
}
