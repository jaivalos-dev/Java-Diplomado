package Ejercicios;

public class NombreANumeros {
    public static void main(String[] args) {

        char letras[] =    {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        String numeros[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};

        String nombre = "Javier";
        String resultado = "";

        nombre = nombre.toLowerCase();

        for (int i = 0; i < nombre.length(); i++){
            for (int j = 0; j < letras.length; j++){
                if (nombre.charAt(i) == letras[j]){
                    resultado += " " +numeros[j];
                }
            }
        }

        System.out.println("El nombre: " + nombre + ", se convierte en: " + resultado);

    }
}
