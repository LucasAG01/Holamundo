import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        char opcion='a'; //creo el concepto de opcion
        boolean correcto=true; //Si mete la opcion correcta
        do {
                correcto=true; //reseteo variable de correcto.
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
            case 'b','B':
                System.out.println("Lista provincias");
                break;
            case 'c','C':
                System.out.println("Numero romanos");
                break;
            default: // lo que pasará si no elige a,b,c
                correcto=false; //Si no elige bien la opcion
                System.out.println("Opcion invalida");
                break;
        }
        }//Fin del do
        while(!correcto); //Mientras no elija la Opcion correcta(abc). (Boolean declarado arriba// debajo de do con la opción correcta // debajo de default con la opcion errada).


        //Si quiero que le de igual que sea en mayus o no, Al princio declaro las opciones como un string y luego donde el charat lo quito y pongo toUpperCase.
        //O añado una puta coma y ya


        //CODIGO COPIADO DEL SWITCH********************************

        // Ahora queremos que una vez ejecutado me vuelva a presentar las opciones
        //Do While ejecuta al menos una vez y despues comprueba la condición de continuidad a fiferencia de DO y FOR
        //Colocamos el DO y While donde queremos que se repita todo
        //Declaramos una variable Boolean que que colocaremos para hacer el Do While,
        //Pero al hacer esto así, tras equivocarse y poner la opcion correcta, seguiráç
        //Saliendo el menú, así que hay que resetear la variable correcto debajo del do

        //OJO: cada vez que creamos una nueva llave, hay que redeclarar la variable.


















    }
}
