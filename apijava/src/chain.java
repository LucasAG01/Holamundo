import javax.swing.*;
import java.util.Scanner;

public class chain {
    public static void main(String[] args) {
        String cadena ="En un lugar de la Mancha...";
        int numeroCaracteres = cadena.length();
        char letra = cadena.charAt(4);
        int posicionPrimerEspacio = cadena.indexOf(" ");
        System.out.println(letra);
        int posPrimerSubstring = cadena.indexOf("lugar");
        System.out.println(posPrimerSubstring);



        //substirng

        String subfrase =cadena.substring(4); // Devuelve los caracteres a partir de la posición 4 (aparecen de la 5 palante)
                                                        // si pusiese (4,9) me devolvera los caracteres desde la posicion 4 a la 9
        //split

        String palabras[]=cadena.split(" "); // me genera una matriz donde los espacios trocean los carácteres en esta,
                                                   // en este caso me separa las palabras.


        //startswidth y endswidth

        boolean pregunta= cadena.startsWith("En"); // me dice si la cadena empieza por el caracter que pongo en el parentesis.


        String f= null; // si no doy valor al string se almacena como null


        //equals   comparar 2 strings

        String cad1= "hola";
        String cad2="ert";

        boolean iguales=cad1.equals(cad2);

        String cadena2=" elimina espacios ";
        String cadena2SinEspacios=cadena2.trim(); // me quita espacios al principio y al final

        //replace

        String original="Soy el original";
        String copia= original.replace('i','a'); // en la frase cambiará las i por a.

        //Envoltorios o wrappers   Tratar como objetos a las variables primitivas
        // el envoltorio es poniendo la primera letra mayuscula Byte Short Integer Float
        // sirve para las conversiones entre valosres de tipo string y variables primitivas

        String dni= "12345678E";
        String subDNI= dni.substring(0,8);
        int dniNumero= Integer.parseInt(subDNI);
        int resto= dniNumero%23;

        String S= "34.567";
        float U= Float.parseFloat(S);

        int numeroo=234;
        String numeroString=Integer.toString(numeroo);


        //Character ---> char

        char Letra='3';

        boolean esNumero=Character.isDigit(Letra); // pregunto si el char Letra es numero o no
        boolean esLetra=Character.isLetter(Letra);



        //Lectura por teclado  Para que las variables las pueda dar valores el usuario.

        Scanner lector=new Scanner(System.in); //indico que el origen de los datos es el teclado

        System.out.println("introduce tu nombre");
        String nome=lector.nextLine();
        System.out.println("introduce tu edad");
        int Edad= lector.nextInt();

        System.out.println("bienvenido: "+nome);
        System.out.println("Tienes: "+Edad+" años");
        lector.close(); //cierra los que hemos hecho

        float salario=Float.parseFloat(JOptionPane.showInputDialog("Introduzca su salario: ")); //me devuelve un string con el dato que han metido, pero, ahora me enseña una ventanita drip































    }
}
