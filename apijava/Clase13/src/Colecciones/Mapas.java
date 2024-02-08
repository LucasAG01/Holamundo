package Colecciones;

import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapas {
    public static void main(String[] args) {


        //Los mapas no implemantan la interfaz collection, por lo que no los puedo recorrer con un foreach.
        //Los mapas guardan pàrejas de clave valor, es decir, en vez de guardar un objeto,
        //Al guradar un objeto, lo tengo que vinvular a una clave, por lo que solo lo puedo recuperr a partir de la clave NO DUPLICADAS Y ESTAS ASOCIADAS A UN UNOCO VALOR
        //HashMap / TreeMap
        //https://gyazo.com/3338beac01a146eb6345e940a130beaf

            //Tipo clave , Valor
        HashMap<String,String>alumnos=new HashMap<String,String>();

        //Los mapas utilizan objetos de tipo EntrySet --> key y value
        //Añadir almnos a la entrada.
        alumnos.put("123345E","Lucas Alcobia");
        alumnos.put("312434Y","Emanuel Anuel");
        alumnos.put("213545U","KYS NIGGER");


        //Búsqueda por clave  y me devulve el valor
        String alumno= alumnos.get("213545U");
        System.out.println(alumno);

        //Buscar si hay una clave
        boolean existe=alumnos.containsKey("213545U");
        //Buscar si existe un valor
        boolean existeValor=alumnos.containsValue("KYS NIGGER");


        //RECORRER UN MAPA
        //Un for no sirve porque en cada posicion del mapa no guardo 1 cosa, sino dos (clave, valor)

        //Obetener el conjunto de claves{}
        Set<String> claves=alumnos.keySet();

        System.out.println("Claves utilizadas:");
        for (String clave:claves){
            System.out.println(clave);
        }

        //Obtener valores.
        Collection<String>valores=alumnos.values();

        System.out.println("Valores utilizados");
        for (String valor:valores){
            System.out.println(valor);
        }


        //Recorrer con for ---> EntrySet<String,String>

        Set<Map.Entry<String,String>> entradas=alumnos.entrySet();  //Dentro de set le paso un objeto tipo Entry<Tipocalve,Tipovalor>

        System.out.println("Clave - Valor: ");
        for(Map.Entry entrada:entradas){ //Por cada entrada en el diccionario
            System.out.println(entrada.getKey()+" "+entrada.getValue());
        }



       // HashMap<String,Factura> fs=new HashMap<String,Factura>();  https://gyazo.com/285db7fad74661771d9c7b8fbc8e6af5

        //https://gyazo.com/0fb398db8f1093a08416f8bfab321e32 (Crear los catalogos)


        













































    }
}
