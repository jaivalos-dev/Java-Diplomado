package Clases;

public class Ciclos {


    public static void main(String[] args) {
        //Ciclo for

        System.out.println("-----Ascendente-----");
        for(int i = 0; i <= 20; i+=2){
            System.out.print("i: "+ i + ", ");
        }
        System.out.println(" ");
        System.out.println("-----Descendente-----");
        for(int i = 20; i >= 0; i-=2){
            System.out.print("i: "+ i + ", ");
        }

        // Ciclos for anidados
        System.out.println(" ");
        System.out.println("-----Tablas-----");

        for(int i = 1; i <= 10; i++){
            System.out.println(" Tabla del: " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println( i + " * " + j + " = " + i*j);
            }
        }

        //Ciclo while

        System.out.println("Numeros impares del 1 al 25");
        int w = 1;
        while(w <= 25){
            if ( (w % 2) != 0){
                System.out.print(" " + w +", ");
            }
            w++;
        }

        System.out.println(" ");
        System.out.println("Descomposición de cadenas");
        String nombre = "Javier Alejandro Avalos Galindo";
        int cont = 0;
        while(cont < nombre.length()){
            System.out.print(" " + nombre.charAt(cont) + " ");
            cont++;
        }

        System.out.println(" ");
        System.out.println("Descomposición de cadenas 2");
        int cont2 = 0;
        String palabra = "Java";
        System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " caracteres");
        while(cont2 < palabra.length()){
            System.out.println("Caracter " + cont2 + ": " + palabra.charAt(cont2));
            cont2++;
        }

        System.out.println(" ");
        System.out.println("Numeros aleatorios y validación de multiplos");
        boolean x = true;
        while(x){
            //Math.random genera un numero aleatorio entre 0.00 y 0.99
            //Math.ceil redondea al entero hacia arriba mas cercado ej: 45.8 -> 46
            double num = Math.ceil(Math.random()*50);
            System.out.print(" " + num + ", ");
            if ((num % 10) == 0){
                x = false;
            }
        }

        // Ciclo Do While
        System.out.println(" ");
        System.out.println("Ciclo Do While");
        do{
            System.out.println("Prueba de ciclo do while");
        }while (false);

    }
}
