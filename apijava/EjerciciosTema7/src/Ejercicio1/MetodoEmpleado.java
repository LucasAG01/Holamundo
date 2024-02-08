package Ejercicio1;

public class MetodoEmpleado {
    public static void guardarEmpleado(Plantilla e,Plantilla plantilla1[]){
        //Primera posicion vacia.
        for(int i=0;i< plantilla1.length;i++){
            if(plantilla1[i]==null){
                plantilla1[i]=e;
                break;
            }
        }
    }
}
