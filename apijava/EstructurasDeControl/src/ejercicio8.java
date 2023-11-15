import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {

        int matriz[]={1,5,6,7,4};  //1 Creo matriz
        int maximo=0;
        int posicion=0;
        for(int i=0;i< matriz.length;i++){  //2.recorro matriz
            if(matriz[i]>maximo){
                maximo=matriz[i];
                //guardamos posicion
                posicion=i;
            }

        }
        System.out.println("Valor mas alto: "+maximo);
        System.out.println("Posicion: "+posicion);

    }
}
