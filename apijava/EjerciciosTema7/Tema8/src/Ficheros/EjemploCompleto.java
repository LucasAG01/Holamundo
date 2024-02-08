package Ficheros;

import jdk.jshell.execution.Util;
import utils.Proceso;
import utils.Utilidad;

import java.io.*;
import java.util.Scanner;

public class EjemploCompleto {
    public static void main(String[] args) {

        String ruta = Utilidad.ruta+"\\Procesos.txt";
        //Recuperar info Archivo Procesos.
        //Quiero que la app vuelque la info del fichero en una matriz de objetos de tipo procesos.

        Proceso[]ps=new Proceso[200];

        int opcion;
        Scanner lector=new Scanner(System.in);
        System.out.println("Escoja opcion: ");
        System.out.println("1.leer procesos");
        System.out.println("2.Añadir proceso.");
        opcion= lector.nextInt();


        switch (opcion){
            case 1:
        int posicion=0;

        try (BufferedReader bfr=new BufferedReader(new FileReader(ruta))){ //La lectura me devulve un String y con eso tengo que crear un objeto tipo Procesos
            String registro="";
            while (registro!=null){ //La lectura me devulve un String y con eso tengo que crear un objeto tipo Procesos
                registro=bfr.readLine();
                if(registro!=null){
                String[] partes=registro.split("_"); //Tengo separado las diferentes partes del String Procesos
                //Ahora quiero crear un objeto de tipo proceso y enchufarlo en la 1ra posicion vacia del Array ps
                ps[posicion]=new Proceso(partes[0],partes[1],Long.parseLong(partes[2]));//Lo último es convertir a LONG //Cada atributo
                posicion++;
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        break;
            case 2:
                try(BufferedWriter bfw=new BufferedWriter(new FileWriter(ruta,true))){
                bfw.newLine();
                bfw.write("1233_Hairy nigga_34532"); //Voy cambiando aqui y se va añadiendo.
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;

        }
        //Visualizar por pantalla los procesos almacenados al (lo )

        for(Proceso p:ps){
            if(p!=null)
                System.out.println(p);
        }





        //Editar algun registro en concreto
        ps[0].setDuracion(1200);

        //Vuelco informacion al fichero

    try(BufferedWriter bfw=new BufferedWriter(new FileWriter(ruta,false))) {
        for(Proceso p: ps){
            if(p!=null){
                bfw.write(p.toString());
                bfw.newLine();
            }
        }

    } catch (IOException e) {
        throw new RuntimeException("No soporti buffer");
    }


    }
}
