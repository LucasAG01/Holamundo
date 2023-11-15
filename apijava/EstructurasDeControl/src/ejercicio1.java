import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        //Identifica si un numero es primo o no

        Scanner intr =new Scanner(System.in);
        System.out.println("Introduce un número");
        int n= intr.nextInt();

        boolean primo=true;
       //Ahora debo recorres todos los numeros desde 2 hasta 1 anterior a n
        for(int i=2;i<n;i++){
             if (n%i==0)  {
                 System.out.println("No es Primo");
                 return;
             }
        }
        System.out.println("Primo");







    }
}
