import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N',
                'J','Z','S','Q','V','H','L','C','K','E'};


        Scanner intro=new Scanner(System.in);


        System.out.println("Introduce el numero del DNI:");  //Programamos el input
         String DNI= intro.nextLine();
         intro.close();

        String subDNI= DNI.substring(0,8);  //Extrae los primeros 8 caracteres de la cadena de entrada (la parte numérica del DNI).
        int dniNumero= Integer.parseInt(subDNI); //Convierte la parte numérica extraída en un número entero.
        int resto= dniNumero%23;  //Calcula el residuo al dividir la parte numérica por 23.
        char letra=letras[resto]; //Con el resto que da, me busca la posicion que corresponde en la matriz letra.

        System.out.println("Su letra es:"+letra);















    }
}
