package Colecciones;

import java.util.TreeSet;

public class ConjuntosOrdenados {
    public static void main(String[] args) {


        TreeSet<String> nombres=new TreeSet<String>();  //Un conjunto pero este oredena alfabeticamente /menor mayor y no gurada dupes tambien
        nombres.add("Nigger");
        nombres.add("KYS");
        nombres.add("ONG");
        nombres.add("Nigger");

        for(String i:nombres){
            System.out.print(i+" ");
        }

        System.out.println();



        TreeSet<Integer>numeros=new TreeSet<Integer>();
        numeros.add(8);
        numeros.add(7);
        numeros.add(1);
        numeros.add(2);

        for(Integer i:numeros){
            System.out.print(i+" ");
        }

        System.out.println();

    //En la clase Factura he creado El ClaseObjeto Facturas, ahora creare un conjunto de facturas

        TreeSet<Factura> facturas= new TreeSet<Factura>();

        facturas.add(new Factura("A1",750));
        facturas.add(new Factura("B1",1800));
        facturas.add(new Factura("C1",650));
        facturas.add(new Factura("A1",550));

        //Si ahora cojo y le doy a ejecutar con solo creado los cons/setget/tosString y lo de arriba
        //Me saldra un error: Los objetos de tipo Factura no tiene criterio definido en clase factura que el pueda usar para ordenar Fcaturas.


        System.out.println("Facturas ordenadas por precio: ");

        for(Factura f:facturas){
            System.out.println(f);
        }

































































    }

}
