package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {



        //Conjuntos --> Colecciones de datos que no admiten duplicados.
        //Los elementos no se ordenan por orden de inserción y no estan indexados
        //HashSet y Treeset.{}

    HashSet<String> NIGGAS=new HashSet<String>();  //Creamos conjunto default.


    NIGGAS.add("Pedro");
    NIGGAS.add("Alberto");
    NIGGAS.add("Wazowski");
    NIGGAS.add("Maria");
        //En el HashSet, Si pongo otro nombre duplicado, no lo guarda.

    //RECORRER CONJUNTO DE DATOS.
        for(String s:NIGGAS){
            System.out.println(s);
        }


      /*  //Genero en una matriz 100 nuemeros del 0 al 10

        int matriz[]=new int[100];                                         Metodo 1
        Random aleat=new Random();
        for (int i = 0; i < matriz.length ; i++) {
            matriz[i]=aleat.nextInt(11);
        }
      */
        //Genero en una Arraylist de nuemeros del 0 al 10

        ArrayList<Integer>lista=new ArrayList<Integer>();
        Random aleat=new Random();
        for (int i = 0; i < 20 ; i++) {     //Quiero aññadir 20 unidades
            lista.add(aleat.nextInt(11));   //Se me generaran numeros del 0 al 10 a la lista
        }
            //Ahora se genera la lista, pero tengo numeros repetidos.


        System.out.println("Matriz de nñumeros originales: ");

        for (int numero:lista) { //POR CADA ENTERO, EN numeros (nombre de lo que recorramos)
            System.out.print(numero+" ");
        }

        System.out.println();
        System.out.println();

        //Ahora quiero eliminar duplicados.


        HashSet<Integer>numeros=new HashSet<Integer>(lista);

        System.out.println("Números sin duplicados: ");

        for(Integer i: numeros) {    //POR CADA ENTERO, EN numeros (nombre de lo que recorramos)
            System.out.print(i +" ");
        }


        System.out.println();
        System.out.println();

        //Como no dupea, solo mostrará del 0 al 10.


        HashSet<Integer>numeros2=new HashSet<Integer>();
        numeros2.add(15);
        numeros2.add(18);
        numeros2.add(9);
        numeros2.add(6);

        //addAll

        numeros.addAll(numeros2); //Aáde todos los valores en numeros2 a numeros menos lo que ya questan en se conjunto

        System.out.println("Unión de dos conjuntos");

        for (int n : numeros) {
            System.out.print(n+" ");
        }

        //Podemos comprobra que sale esto(0 1 2 3 4 5 6 8 9 10 15 18) el 9 no lo añadio xq ya estaba

        System.out.println();
        System.out.println();

        //retainAll
        numeros.retainAll(numeros2); //Solo estaran en numeros, quellos elementos que coincidan con numeros2 o que aparezcan en numeros2 y no estan en numeros
                                        //Ahora mismo soin iguales

        System.out.println("Intersección de dos conjuntos: ");

        for (Integer o : numeros) {
            System.out.print(o +" ");
        }

        System.out.println();
        System.out.println();


        //removeAll
        numeros.add(99); //Añadimos esto para que aparezca algo en el sout
        numeros2.add(88);
        numeros.removeAll(numeros2); //Elimina de numeros, todos los elementos que estean también en numeros2

        System.out.println("Aplicacion de remodeAll");

        for (Integer i : numeros) {
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println();

        //Ahora creare un conjunto de facturas, como el que he creado en COnjuntosOrdenados.

        HashSet<Factura> facturas=new HashSet<Factura>();

        facturas.add(new Factura("A1",750));
        facturas.add(new Factura("A1",750));    //Para ver si guarda la factura duplicada (En este caso sí)
        facturas.add(new Factura("I3",49));

        for (Factura fs : facturas) {
            System.out.println(fs +" ");
        }



        //Añadir criterio de igualdad.  hay que modificar 2 metodos ---->Equals, HashCode  ASÍ LOGRAREMOS QUE NO SE GUARDEN DUPED
        //ESTO ES EN LA CLASE FACTURAS


        //DESPUES HE AÑADIDO EL COMPLEMENTS PARA ORDENARLOS POR PRECIO

        TreeSet<Factura>ts=new TreeSet<Factura>(facturas);  //ordenadas por precio













    }
}

