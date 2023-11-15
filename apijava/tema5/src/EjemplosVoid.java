import java.util.Arrays;
import java.util.Random;

public class EjemplosVoid { //{}








   //Mensaje x pantalla
    public static void escribir(String mensaje){
        System.out.println(mensaje);
    }


    public static void escribir(int matriz[]){
        for(int valor:matriz){
            System.out.print(valor+" ");
        }
        System.out.println();
    }
//Return y void
    //return es una sentencia que se utiliza para devolver un valor desde un método.
    //void es un tipo de dato que indica que un método no devuelve ningún valor.


public static int duplicar(int n){
        n=n*2;                        //Me sale el nuemro que puse, no lo opera

    return n;
}

//El problema es que el método no devuelve ningún valor,
// por lo que el valor duplicado no se almacena en ninguna variable.
//
//Para que el código funcione correctamente, el método debe devolver el valor duplicado.
// Esto se puede hacer utilizando la sentencia return

//tengo que poner return=n*2 por lo que el VOID se cambia por INT y poner lo que quiero
// que me devuelva, sin el return, el (n=n*2) es la operacion, pero una vez que se hace,
//no acaba en ninguna parte, debo poner abajo (return n;)



    //Método que reyena una matriz de nuemor aleatorios

    static void rellenarMatriz(int[]x){
        Random aleatorio=new Random();

        for(int i=0;i<x.length;i++){ //recorro la matriz con el tamaño deseado() o usando el .length, ya que declararé la matris como vea
            x[i]= aleatorio.nextInt(20);  //Genera numeros del 0 al 20 en este casp
        }

    }

    //Busca nuemros negativos en un array chungo y los convierte en positivos

    /*public static void positivizar(int x[][]){
        for(int i=0;i<x.length;i++){ //primera caja fila
            for(int j=0;j<x[i].length;j++){ //segunda caja columna
                if(x[i][j]<0){} //No acabé
            }
        }


     */


   public static double calcularMedia(int...n){ //indico parametros opcionales
       int suma=0;
       for(int valor:n){
           suma=suma+valor;
       }
       return suma/n.length;  //Si no le pongo double me devuelve media redondeada(int)
   }

//Crea una variable suma para almacenar la suma de los números enteros.
//Itera sobre los elementos de la lista n y suma cada elemento a la variable suma.
//Devuelve la variable suma dividida por el número de elementos de la lista n.


   /* En el método calcularMedia(), la variable valor es una variable de tipo
    int que se utiliza para almacenar el valor de cada elemento de la lista n.

    La variable valor se declara utilizando una variable de tipo varargs, int...n.
    Esto significa que la variable valor puede almacenar uno o más valores de tipo int.

    En el bucle for, la variable valor se utiliza para iterar sobre los elementos de la lista n.
    Cada vez que el bucle se ejecuta, la variable valor almacena el valor del elemento actual de la lista n.

    La variable valor se utiliza luego para sumar el valor del elemento actual a la variable suma.

    En resumen, la variable valor es una variable que se utiliza para almacenar el valor de cada elemento de una lista de números enteros.

   */


//recurso para saltarnos escribir el metodo de la clase sin poner al principio METODOS.ssa
    //import static (paquete).clase.*;


//Tambien sirve para las clases default
    //import static java.lang.Math.*;
    //imoport static java.lang.System.*




//DEVULEVE UN ARRAY.*******************************  {}

    //Método que recibe un array y devueleve un array con llos mismos valores

public static int[] doblarCapacidadArray(int m[]){
    int copia[]=new int [m.length*2];  //creo un array con el doble de capacidad

   copia= Arrays.copyOf(m,copia.length); //Volcando todos los elementos de m a copia *RECUERDA EL COPIA= AL PRINCIPIO*
    return copia; //devuelvo el array que he creado.
}















}