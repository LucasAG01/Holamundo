import java.util.Scanner;

// recuerda darle click derecho en chain y luego copiar el psvm
public class ejercicio2 {
    public static void main(String[] args) {
//Programa que calcula el máximo y el mínimo de 2 números enteros introducidos por teclado.

        int x,y,z,q,maximo,minimo;                 //Declarar todas las variables 3 numeros(x,y,z) y las operaciones
        Scanner cal=new Scanner(System.in);
        System.out.println("primers nuemero:");
        x=cal.nextInt();                        //guarda el valor introducido x y en este caso como un Int.
        System.out.println("Segundo numero:");
        y=cal.nextInt();
        System.out.println("tercer numero:");
        z=cal.nextInt();
        System.out.println("tercer numero:");
        q=cal.nextInt();

        cal.close();

        minimo=Math.min(x,y);
        maximo=Math.max(x,y);

        //Para obtener el menor de los 3 números volvemos a
        //utilizar la mfunción min y lo mismo con max
        //estas funciones son transitivas y conmutativas. Esto significa que puedes aplicarlas
        //repetidamente a múltiples valores y obtener el mínimo y el máximo sin importar el orden en el que los compares.
        //va en escalera 1 valor mas 1 max/min mas.

        minimo=Math.min(minimo,z);
        maximo=Math.max(maximo,z);

        minimo=Math.min(minimo,q);
        maximo=Math.max(maximo,q);

        System.out.println("El menor es : " + minimo);
        System.out.println("El mayor es : " + maximo);

















    }

}
