import java.util.Arrays;

public class Ejemplo2D {
    public static void main(String[] args) {
    //Aun es tema 4
        int matriz[][]=new int[3][3];
        /*
            0,0  0,1  0,2
            1,0  1,1  1,2  posiciones
            2,0  2,1  2,2
         */

        //Llenar la matriz de unos

        for (int i=0;i<matriz.length;i++){ // recorre las filas, i para filas
            for (int j =0;j< matriz[i].length;j++){ //recorre columnas, j para columnas
                matriz[i][j]=1; //he comprobabo que la i sea menor que length y lo cambia
            }
        }

        //Mostrar por la pantalla

        for(int i=0;i< matriz.length;i++) { // recorre las filas, i para filas
            for (int j=0;j< matriz[i].length;j++){ //recorre columnas, j para columnas
                System.out.print(matriz[i][j]+ " "); //Hizo 1 fila
            }
            System.out.println(); //ESTO DEBE ESTAR AQUÍ DEBAJO DEL 2 FOR Y ENCIMA DL 1
        }

        //Calcular media
        int suma=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                suma= suma + matriz[i][j];
            }
        }
        double media =suma/(matriz.length*matriz[0].length);              //media=suma/capacidad

        //calcular valor más alto

        int maximo=matriz[0][0];

        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==0 && j==0)//
                    continue; // cuando se cumpla esta condicion (&&) no ejecute lo de abajo

                if (maximo< matriz[i][j]){
                    maximo=matriz[i][j];
                }
            }
        }










































    }
}
