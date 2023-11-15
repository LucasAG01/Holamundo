import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

       //{}
       //Realizar un programa que detecte cuantas palabras de una cadena empiezan por Z o por z.

        Scanner intr=new Scanner(System.in); //Primero el scanner
        System.out.println("intridceo");
        String frase=intr.nextLine();

        int contador=0; //En el momento que nos dicen contar, sumar... hay que crear un contador qur alamcene

        for(String palabra : frase.split(" ")){  //Con el each dibidivos la matriz creando el string palabra
            if(palabra.charAt(0)=='z'||palabra.charAt(0)=='Z'){  //Con el string si sale el charAt
                contador++; //Si encuentra la z suma 1 al contador
            }
        }
        System.out.println("Hay "+contador+" palabras que empiezan por z ");
    }







    }

