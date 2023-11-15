import java.util.Arrays;

public class matrices {
    public static void main(String[] args) {

        //Array=  -→ almacena valores del mismo tipo
        int[] valores = new int[10]; //capacidad 10 valores
        valores[0] = 9;
        System.out.println("Posicion 1: " + valores[1]);  //mostrar que número está en la posición el valor 0 es 9
        //Última posición de la matriz
        valores[9] = 2;
        //No se puede acceder a posiciones más lejanas
        //valores[10]=3; -→ Excepción de índice no permitido

        //Declarar e inicializar un array
        float temperaturas[] = {12.4f, 7.4f, 18.2f}; //esto es 1 fila
        float tempMes[][]= {{1,2,3},{5,6,7},{9,8,4}};
        //1, 2, 3
        //5, 6, 7
        //9, 8, 4
        tempMes[0][0]=24;
        //calcular media mes enero
        float mediaEnero= (tempMes[0][0] + tempMes[0][1]+ tempMes[0][2])/3;
        System.out.println(mediaEnero);

        //Propiedad length me indica en un array de 1 dimension cuantos elementos tiene
        int capacidad= temperaturas.length;
        System.out.println("capacidad: "+capacidad); //me da 3 ya que lo saca de (12.4f, 7.4f, 18.2f)

        //Acceso seguro a la última posición
        temperaturas[temperaturas.length-1]=30;  // la expresion .length-1 obligatoria
        float ultimaTemperatura=temperaturas[temperaturas.length-1];
        System.out.println(ultimaTemperatura); //da 30

        //Mostrar un array por consola
        System.out.println((temperaturas[0])+ " "+ temperaturas[1]); //no olvides los parentesis

        //Utilizando la clase Arrays
        System.out.println(Arrays.toString(temperaturas)); //me muestra 12.4f, 7.4f, 18.2f
        //otros métodos de la clase Arrays
        Arrays.sort(temperaturas);
        System.out.println("Temperaturas ordenadas de menor a mayor: ");
        System.out.println(Arrays.toString(temperaturas)); // me imprime la matriz con los valores que está almacenando

        //Buscar un valor en el Array --> Binarysearch
        int posicion=Arrays.binarySearch(temperaturas,12.4f);
        System.out.println("Posición: "+posicion); //Me dice en qué posición está. (en este caso la 1), ya que sigue este orden (12.4f, 7.4f, 18.2f)
        //SOLO si está el royo ordenado o SOLO si quiero saber si está.
        //Si el mismo valor está duplicado aparecerá una u otra.

        int original[]={1,2,3,4,5};
        int copiaBien[]= Arrays.copyOf(original, original.length); //2 i guess
        int copiaMal[]=original;
        copiaMal[0]=20;
        System.out.println(original[0]); // se modificó el original también.














    }
}
