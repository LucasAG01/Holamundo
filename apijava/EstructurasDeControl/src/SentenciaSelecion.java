import java.util.Scanner;

public class SentenciaSelecion {
    public static void main(String[] args) {

        //if else
        //Programa que indica si un nuemro es par o impar

        int n;
        Scanner intr= new Scanner(System.in);
        System.out.println("Intruduzca un número");
        n=intr.nextInt();


        if (n % 2==0) {  //el resto al dividir entre 2 es 0
            System.out.println("El nuemro es par");
        }
        else {
            System.out.println("El número es impar");
        }


        System.out.println("Final del programa");


















    }
}
