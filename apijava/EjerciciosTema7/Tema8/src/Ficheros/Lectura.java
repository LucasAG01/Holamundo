package Ficheros;

import utils.Utilidad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    public static void main(String[] args) {

        //Mostramos la tuta
        System.out.println(Utilidad.ruta);

        String fichero=Utilidad.ruta+"\\Procesos.txt"; //docle barra para que interprete que es 1 barra
        //Leer de un fichero de texto usamos 2 clases--->
        try {
            FileReader lector=new FileReader(fichero);//Aqui le paso la ruta definida en clase utilidad{}
            BufferedReader bf=new BufferedReader(lector); //Leer grandes cantidades, ahora tendre metodos necesariops para leer registros
            //Hay que cerrar accesos po si queremos abrirlo desde otro lado
            String registro="";
            while (registro!=null){
                registro= bf.readLine(); //Este metodo está programado para lanzar también una excepcion, toca poner try catch
                System.out.println(registro); //Muestra las cosas y cuando acaba pone null. Para quitar el null(https://gyazo.com/dd10b08707f45e8a2ef7131965dabf78)
            }
            lector.close(); //Los accesos cerrados Primero lector y luego bufer
            bf.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            throw new RuntimeException("El bufer no soporto la lectura");
        }
        //Me da un error al poner (Utilidad.ruta) me obliga a capturarla(trycatch).
        //He creado dentro de la carpeta HolaMundo, un txt llamdo Procesos.
        //Ahora creare una clase donde escribir el fichero. Escritura
    }
}
