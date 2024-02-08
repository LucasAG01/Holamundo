package Ficheros;

import utils.Utilidad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public static void main(String[] args) {

        //Escribismos fichero otra vez
        String fichero= Utilidad.ruta+"\\Procesos.txt";

        //Abro el Procesos arrastrandolo de la carpeta.
        //Hay formas de crearlos sin hacerlos a mano.

        try {
            FileWriter escritor=new FileWriter(fichero,true);//Se crea con 2 argumentos RUTA(fichero) y un Booleano(true(añadir al fichero) false(Sobreescribe lo que haya dentro))
            BufferedWriter bfw=new BufferedWriter(escritor);//hacemos TryCatch //Si no uso el escritor mas adelante puedo hacer esto (https://gyazo.com/a7f9327c86c1426f320bbb770d02ba32)

            bfw.write("1909_Rotacion Maquina_45000");
            bfw.close(); //Primeri se cierra buffer y luego escritor
            escritor.close();

        } catch (IOException e) {
            throw new RuntimeException("No soportó");
        }
            //En la clase TryRecursos, puedo escribir y hacer saltos de línea y no poner closes.
    }
}
