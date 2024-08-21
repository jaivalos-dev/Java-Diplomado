public class Matrices {
    public static void main(String[] args){

        //Formas de declarar matrices
        int matriz1[][] = new int[2][2];
        int matriz2[][] = {};
        int matriz3[][] = {{2,3,4},{4,3,2},{3,4,5}};

        //Recorrer una matriz
        int edades[][] = {{19,18,16}, {15,14,12}, {11,65,43}};

        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(edades[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
