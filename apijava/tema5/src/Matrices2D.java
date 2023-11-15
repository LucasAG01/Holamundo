public class Matrices2D {
    public static void main(String[] args) {

       //MATRICES 2D

       int matriz[]=new int [10];

        int matriz2[][]=new int[5][3]; //5 filas 3 columnas
        int matriz3[][]=new int[2][2]; //matriz cuadrada mismo numerode filas q oclumnas

        /*             1= fila 0 clumna 0
           1 2         2=fila 0 columna 1    Los indices son 1 1
           3 4         3=fila 1 columna 0
                       4=fila 1 columna 1
         */

        matriz3[0][0]=9;  //numero en fila 0 columna 0 = 9

        int matrizIrregular[][]=new int[3][]; //MAtriz de 3 filas y ahora hay que indicar capacidad de cada una de las 3 filas

        matrizIrregular[0]=new int[4];
        matrizIrregular[1]=new int[2];  //array con capacidad de 2 elementos
        matrizIrregular[2]=new int[8];

        /*
            0 0 0 0                        ----> fila 0 4 columnas
            0 0                            ---->fila 1 2 columnas
            0 0 0 0 0 0 0 0                    (Siemre tabajaremos con regulasres)

         */


        //.lenght ---> Devuelve el numero de filas
        int filas= matriz2.length;
        int columnas=matriz2[0].length; //Con poner lo de abajo vale esto es para ver kmo se hac
        int capacidad=filas*matriz2[0].length;
        System.out.println(filas); //5
        System.out.println("Capacidad: " +capacidad);  //15


        //Obetener capacidad matriz irregular con for   {}
        int n=5;
        int matriz4[][]=new int[n][];
        matriz4[0]=new int[4];
        matriz4[1]=new int[5];

        int capacidad2=0;
        for (int i=0;i<matriz4.length;i++){
            capacidad2= capacidad2 + matriz4[i].length; //Tengo k ir obtenendo el tamaño de cada fila
        } //Dara error porque no esta inicializada la fila 2 y 3 4




















    }
}