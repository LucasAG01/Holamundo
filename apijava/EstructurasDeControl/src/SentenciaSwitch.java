import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {

       //Otra manera de if else if, se suele usar si quiero presentar un menu a un usuario y quiero que escoga una opción

        char opcion='a'; //creo el concepto de opcion
        System.out.println("Escoga una opción: ");
        Scanner intr=new Scanner(System.in);

        System.out.println("a. Validar DNI ");
        System.out.println("b. Ver provincias españolas");
        System.out.println("c. Mostrar numero romanos");

        opcion=intr.nextLine().charAt(0); //yo le paso una posición y me devuleve el cacrter del string que ocupa pos 0

        //Le quiero decir que si escribe "a", ejecute el codigo de a, SI es "b", ejecute codigo de b SI es "c" que ejecute codigo opción c
        // SI NO elige esas saltará el mensaje de "opcion inválida"

        switch (opcion){

            case'a','A': //Escribo primero CASO si elige 'a' y debajo el final break y en medio programo lo que pasará si elige 'a'
                System.out.println("Validacion DNI");
                break;
            case 'b':
                System.out.println("Lista provincias");
                break;
            case 'c':
                System.out.println("Numero romanos");
                break;
            default: // lo que pasará si no elige a,b,c
                System.out.println("Opcion invalida");
                break;
        }

        //Si quiero que le de igual que sea en mayus o no, Al princio declaro las opciones como un string y luego donde el charat lo quito y pongo toUpperCase.
        //O añado una puta coma y ya







    }
}
