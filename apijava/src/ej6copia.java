import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ej6copia {
    public static void main(String[] args) {

    int numero[]=new int[5];
    int copia[]=new int[numero.length];

    //Darle valores aleatorios

        numero[0]= (int)(Math.random()*10); //Número entre 0 y 9 (ejemplo), de normal haríamos como abajo con todas
        Random aleatorio=new Random(); //creamos la variable aleatrio
        numero[1]=aleatorio.nextInt(20);
        numero[2]=aleatorio.nextInt(20);
        numero[3]=aleatorio.nextInt(20);
        numero[4]=aleatorio.nextInt(20);


    //Mostrar primera y última posicion

        System.out.println("pimera posi:" + numero[0]);
        System.out.println("última posi:" + numero[numero.length-1]);

    // A) crear copia y ordenarla

    copia= Arrays.copyOf(numero,numero.length);
    Arrays.sort(copia);



    //B) Mosrtamos la matriz original para comprobar

        System.out.println(numero[0]+" "+numero[1]+" "+numero[2]+" "+numero[3]+" "+numero[4]);


    //C) Solicitar al usuario que introduzca un valor para buscarlo en la copia

        int numeroABuscar;
        Scanner intro= new Scanner(System.in);
        System.out.println("introduce un valor:" );
        numeroABuscar= intro.nextInt();

        int posicion = Arrays.binarySearch(copia,numeroABuscar);
        System.out.println(numeroABuscar+" está en la posición "+posicion);


       // CONCLUSIÓN LOS ENUNCIADOS VAN EN LÍNEA EN ORDEN.SI NO HACES LO DE ARRIBA NO PUEDES IR ABAJO.


















    }
}
