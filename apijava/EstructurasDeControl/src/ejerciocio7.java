import java.util.Arrays;

public class ejerciocio7 {
    public static void main(String[] args) {

        int matriz[]={1,23,4,-2,5,6,-4};
        int poscion=-1;
        for(int i=0;i< matriz.length;i++){
            if(matriz[i]<0){
                poscion=i;  //declaramos la posicion a guardar
                break;      //El bucle termina en el momento que pilla el primer
            }
        }

        if (poscion==-1){
            System.out.println("No hay negativos"); //Si no se modifica la variable posicion sale esto
        }
        else{
            System.out.println("Primer negativo en: "+poscion); //Si lo hace me dice la posicion.
        }

    }
}
