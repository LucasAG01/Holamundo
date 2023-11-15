import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

      //1 Programar un método llamado printar que reciba un String y lo muestre por consola.

        String mensaje="kys nigger";
            METODOS1.printar(mensaje);





        /*
     2 Programar un método que devuelva el valor más alto de los que recibe como argumentos
    (una cantidad variable de argumentos) Sobrecargar el método para que trabaje con enteros
    y con double.
        */

        int MasAlto=METODOS1.maximo(3,4,5,67,3);

        System.out.println(MasAlto);

        double MasAlto2=METODOS1.maximo(2.3,2.5,4.6,7.4);

        System.out.println(MasAlto2);


        /*
      3 Programar un método que reciba una matriz y la rellene con números aleatorios.
      Sobrecargarlo para que funcione con variables de tipo int y con float.
         */

        int matrizz[]=new int[65];
        METODOS1.rellenarMatriz(matrizz);
        METODOS1.imprime(matrizz);

        float matrizzz[]=new float[34];
        METODOS1.rellenarMatriz(matrizzz);
        METODOS1.imprime(matrizzz);




        /*
        funcuion primo o no
         */

        int lista[]={2,5,89,6,7,8,9,10,11};

        METODOS1.priimo(lista);

        /*
        Programar un método que reciba un String y devuelva el número de palabras de dicho String
         */

       /* Scanner intr=new Scanner(System.in);
        System.out.println("u nigga: ");
        String niggaballzs= intr.nextLine();

        System.out.println("BICHAHNIGGA: "+METODOS1.contarpalabras(niggaballzs));
        /*



       /*
       Programar un método que reciba una matriz y devuelva otra matriz con los mismos valores pero el doble de capacidad.
       */


        int kys[]={2,34,5,6,7,8,9,21};
        System.out.println(Arrays.toString(METODOS1.imprimirArray(kys)));  //No se puede imprimir el Array sin convertirlo a un String /int ..
        System.out.println(Arrays.toString(METODOS1.doblar(kys)));










    }
}
