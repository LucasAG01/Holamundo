package Ficheros;

import utils.Utilidad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryConRecursos {
    public static void main(String[] args) {


        String ruta= Utilidad.ruta+"\\Procesos.txt";

        try(BufferedWriter bfw=new BufferedWriter(new FileWriter(ruta,true))){ //Añado tryCatch  ///Se crea con 2 argumentos RUTA("ruta" creado L.11) y un Booleano(true(añadir al fichero) false(Sobreescribe lo que haya dentro))
            bfw.newLine();
            bfw.write("9090_Caída del Brazo_2132");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
