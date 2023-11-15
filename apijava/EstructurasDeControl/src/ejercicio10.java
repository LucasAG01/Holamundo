import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner intr=new Scanner(System.in);
        System.out.println("introduce una frase");
        String frase=intr.nextLine(); //tring frase

        for(int i=0;i<frase.length();i++){ //recorremos la frase nos da igual el concepto de palabra
            char letra=frase.charAt(i); //guardar posicion
            if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
                //No detecta vocales con acento, trandria que añadirlas yo

                System.out.println("Vocal "+letra+" En posicion: "+i);

            }
        }











    }
}
