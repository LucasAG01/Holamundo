
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        boolean correcto=true;

        Scanner intr=new Scanner(System.in);
        System.out.println("Introduce tu DNI: ");
        String DNI=intr.nextLine();

        if(DNI.length()!=9){ //SI el DNI tiene menos de 9 cacteres
            System.out.println("Numero carcters cincorrecto");
            correcto=false;
        }
        else{ //Si tiene 9
            //Recorremos el string y comprobamos las 8 primeras posiciones solo tienen numeros
            for(int i=0;i<8;i++){
                if(!Character.isDigit(DNI.charAt(i))){ //si hay no hay digitos en la matriz i
                    correcto=false;
                    System.out.println("Hay letras en numero");
                }
            }
            if(!Character.isLetter(DNI.charAt(8))){ //si en el digito 8 no hay una letra.
                correcto=false;
                System.out.println("No hay letra al final");
            }
        }












    }
}
