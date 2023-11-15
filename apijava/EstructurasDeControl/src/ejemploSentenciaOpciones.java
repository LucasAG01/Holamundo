import java.util.Arrays;
import java.util.Scanner;

public class ejemploSentenciaOpciones {
    public static void main(String[] args) {

        int opcion; //abajo en el while me dio un error que se soluciona así
        do {
            System.out.println("Escoja una opción:");
            System.out.println("1. Decir si un numeroe s positivo");
            System.out.println("2. Calcular la raiz de un número");
            System.out.println("3. Contar palabras");

            Scanner intr = new Scanner(System.in);
            opcion = intr.nextInt();

            if (opcion == 1) {
                System.out.println("Intro numero:");
                int n = intr.nextInt();
                if (n > 0) {
                    System.out.println("Positivo");
                }//Final if n>0
                else {
                    System.out.println("Negativo o cero");
                }//Final else negativo o cero

            }//Final if opcion==1
            else if (opcion == 2) {
                System.out.println("Introduzca numero positivo: ");
                int radicando = intr.nextInt();
                double raiz = Math.sqrt(radicando);
                System.out.println("Raiz de " + radicando + " = " + raiz);
            }//Final opcion 2
            else if (opcion == 3) {
                System.out.println("introduzca frase:");
                //resetear el Scanner
                intr = new Scanner(System.in);
                String frase = intr.nextLine();
                String palabras[] = frase.split(" ");
                int NumeroDePalabras = palabras.length;
                System.out.println("Palabras: " + NumeroDePalabras);
            }//Final opcion 3
            else { //acabo aqui con un else para cerrar el 1er if, si pones cualquier otra cosa que no sea 1,2,3 salta lo de abajo
                System.out.println("La opción no existe");
            }
        }//Cierro el do (puse los bucles (do/while) tras haber hecho el royo
        while (opcion > 3||opcion<1); // mientras no salga una opcion correcta se volvera a iniciar desde arriba

        //SI DOY CLICK EN EL NUMERO DE LA LÍNEA Y SE PONE ROJO,
        // HAGO QUE EL PROGRAMA SE EJECUTE HASTA ESE PUNTO


    }
}
