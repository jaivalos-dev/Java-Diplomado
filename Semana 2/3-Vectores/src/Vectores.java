public class Vectores {
    public static void main(String[] args){

        System.out.println(" ");
        System.out.println("---------------------------------");

        //Declaración sencilla de un vector
        String estudiantes[] = new String[3];

        estudiantes[0] = "Javier";
        estudiantes[1] = "Juan";
        estudiantes[2] = "Mateo";

        for (int i = 0; i < estudiantes.length; i++){
            System.out.print( i + ". " + estudiantes[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("---------------------------------");

        //Los vectores se pueden inicializar y dar valor
        String nombres[] = {"Javier", "Alejandro", "Galindo"};
        for (int i = 0; i < nombres.length; i++){
            System.out.print(i + ". " + nombres[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("---------------------------------");
    }
}
