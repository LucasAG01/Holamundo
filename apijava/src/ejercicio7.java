import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner intr = new Scanner(System.in);
        System.out.println("Introduce una frase : ");
        String frase = intr.nextLine();



        String[] separaciones=frase.split(" "); //la dividi por los espacios por lo que saco las palabras
        int palabras= separaciones.length; //sigo como de grande es la matriz creada anteriormente n este caso 3
        System.out.println(palabras + " palabras componen la cadena.");

        int dondeA0=separaciones[0].indexOf('a');
        int dondeA1=separaciones[1].indexOf('a');
        int dondeA2=separaciones[2].indexOf('a');

        System.out.println("En la primera palabra la 'a' está en la posicion "+dondeA0 );
        System.out.println("En la segunda palabra la 'a' está en la posicion "+dondeA1 );
        System.out.println("En la tercera palabra la 'a' está en la posicion "+dondeA2 );

        System.out.println("///////////////////////////////////////////////////////////////");

        char primerCaracter0 = separaciones[0].charAt(0);
        char primerCaracter1 = separaciones[1].charAt(0);
        char primerCaracter2 = separaciones[2].charAt(0);

        System.out.println("en "+ separaciones[0]+ " el primer carcter es: "+ primerCaracter0 );
        System.out.println("en "+ separaciones[1]+ " el primer carcter es: "+ primerCaracter1 );
        System.out.println("en "+ separaciones[2]+ " el primer carcter es: "+ primerCaracter2);

        System.out.println("///////////////////////////////////////////////////////////////");

        char ultimoCaracter0 = separaciones[0].charAt(separaciones[0].length() - 1); //despues del charAt( esta es la forma de poner
        char ultimoCaracter1 = separaciones[1].charAt(separaciones[1].length() - 1); //que sea el último carcter
        char ultimoCaracter2 = separaciones[2].charAt(separaciones[2].length() - 1);

        System.out.println("en "+ separaciones[0]+" el último carcter es: "+ultimoCaracter0);
        System.out.println("en "+ separaciones[1]+" el último carcter es: "+ultimoCaracter1);
        System.out.println("en "+ separaciones[2]+" el último carcter es: "+ultimoCaracter2);

        
        System.out.println("///////////////////////////////////////////////////////////////");

        Scanner intr2 = new Scanner(System.in);
        System.out.println("Introduce una letra e indico en qué posicion se encuentra. : ");
        char frase2 = intr.next().charAt(0);


        int posicionLetra0 = separaciones[0].indexOf(frase2);
        int posicionLetra1 = separaciones[1].indexOf(frase2);
        int posicionLetra2 = separaciones[2].indexOf(frase2);

        System.out.println("La letra '" + frase2 + "' está en la posición " + posicionLetra0 + " de la primera palabra.");
        System.out.println("La letra '" + frase2 + "' está en la posición " + posicionLetra1 + " de la segunda palabra.");
        System.out.println("La letra '" + frase2 + "' está en la posición " + posicionLetra2 + " de la tercera palabra.");







    }



    }

