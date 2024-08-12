package Clases;

public class Variables {

    //Números enteros

    //byte: Emplea un solo byte (8 bits) de almacenamiento.
    //Esto permite almacenar valores entre [ -128 - 127 ]
    byte numeroByte = 9;

    //short: Emplea el doble almacenamiento de byte
    //Permite almancenar valores entre [ -32,768 - 32,767 ]
    short numeroShort = 32767;

    //int: Emplea un tamaño mayor, 4 bytes
    int numeroInt = 41825;

    //long: Emplea el tamaño mayor de todos los enteros, 8 bytes.
    long numeroLong = 92988384284L;


    //Números decimales

    //float: Emplea un tamaño de 32 bits
    float numeroFloat = 938748.834F;

    //double: Emplea un tamaño de 64 bits
    double numeroDouble = 8234837483.8732874F;


    //boolean: Se emplea con la finalidad de trabajar con valores verdaderos / falsos
    boolean variablesBoolean = true;


    //char: Se emplea para almacenar caracteres individuales.
    char numeroChar = 2;
    char letraChar = 'd';


    //String: Se emplea creando una instancia de la clase String.
    String variablesString = "Hola a todos.";


    //Vector - Arreglo: Se emplea para almacenar un grupo de datos del mismo tipo.
    int vectorNumeros[] = { 1, 2, 3, 4, 5, 5, 6 };

    //Matriz: Se emplea para almacenar un grupo de datos del mismo tipo de forma bidimensional.
    int matrizNumeros[][] = { {1, 2}, {5, 6} };


    //Constantes:

    final Float NUMPI = 3.14F;

}
