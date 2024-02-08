package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ejemplo1 {
    public static void main(String[] args) {


        ArrayList<String> series=new ArrayList<String>();
        //Creo una lista con el constructor por derfecto, x lo que la capacidad es 10
        //Obtener el tamaño size

        System.out.println("Tamaño inicial: "+series.size());

        //Añadir objetos a la lista
        series.add("Ozark");
        series.add("Breaking Bad");
        series.add("Stranger things");
        series.add("The wire");

            //Recorres lista
        for(int i=0;i< series.size();i++){
            System.out.println(series.get(i));
        }

        //Obtner numero elemnetos ahora
        System.out.println("Nº elementos ahora: "+series.size());

        //Insertar un elemento en medio de la lista
        series.add(3,"Fargo");

        //Recorres la lista de nuevo pero con un ForEach
        for(String s:series){
            System.out.println(s);
        }

        //Intercambiar un elemento por otro.
        series.set(0,"Vikingos");

        //Eliminar elementos:
        //a) Por índice
        series.remove(0);
        //b)por valor
        series.remove("Ozark");

        System.out.println("Despues de eliminar: ");
        for (String s:series){
            System.out.println(s);
        }


        System.out.println("Despues de usar iterator: ");

        Iterator<String> it= series.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Vamos a modificar la colecicon iterator
        series.add("Los Soprano");
        it= series.iterator();
        System.out.println("Despues de eliminar con Iterator II: ");
        while (it.hasNext()){
            System.out.println(it.next());
        }














    }
}
