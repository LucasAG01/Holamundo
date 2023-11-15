import javax.print.DocFlavor;
import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner intro= new Scanner(System.in);

        System.out.println("Introduzca su correo:");
        String correo=intro.nextLine();

        int posicionPrimerArroba= correo.lastIndexOf("@");// String [] partes(como llamó a la matriz) = intro.split("@"); usa el @ como divisior de las partes.
        String dominio=correo.substring(posicionPrimerArroba);//no hace falta
        intro.close();




        System.out.println("Tu correo pertenece al dominio de:\n"+ dominio); //System.out.println("El dominio es : " + partes[1]);











        

    }
}
