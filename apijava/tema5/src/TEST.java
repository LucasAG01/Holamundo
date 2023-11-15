import java.util.ArrayList;
import java.util.Arrays;

public class TEST {
    private static boolean isPrimo(int n){
        boolean Primo=true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                Primo=false;
                break;
            }
        }
        return Primo;


    }

    public static void main(String[] args) {

        //Prubas metodo es esPar(int n)
        int numero=7;
        System.out.println(METODOS1.esPar(numero)); //PAse una cosa hecha en METODOS1

        //Otro metodo
        int numero2=7;
        if(METODOS1.esPar(numero)){
            System.out.println("PAr");
        }
        else{
            System.out.println("IMPAR");
        }//PAse una cosa hecha en METODOS1

        int matriz[]={7,2,5,4,3,9,13,8};

        boolean Primo=true;
        int contador=0;

        for(int i=0;i< matriz.length;i++){
            if(isPrimo(matriz[i])){
                contador++;
            }
        } //Gracias al método(lo cree arriba del codigo), simplifiqué all de abajo

        /*for(int i=0;i<matriz.length;i++){
            Primo=true;
            for(int j=2;j<matriz[i];j++){
                if(matriz[i]%j==0) {
                   Primo=false;
                   break;
                }
            }
            if (Primo){
                contador++;
            }
        }*/


        int res= METODOS1.suma(8,4);

        int x=6;
        int y=7;
        System.out.println("La suma da: "+ METODOS1.suma(x,y));


        METODOS1.MostrarMensaje();

        int a=3;
        int b=2;
        int c=4;

        System.out.println("Media: "+METODOS1.calcularMedia1(a,b,c)); //AUnque el Método ponga x y z puedo poner
                                                                      //necesite luego.

        int kys=1;
        System.out.println("Valor kys antes de resetear: "+kys);
        kys=METODOS1.resetear1();
        System.out.println("Valor kys tras resetear: "+kys);


        /*double m1= METODOS1.calcularMediaaa(Arrays.asList(4, 5, 3,1));
        System.out.println("Mediaa m1: "+m1);
        int caco=9;
        int coca=1;
        int coco=3;
        double m2=METODOS1.calcularMediaaa(Arrays.asList(caco,coca,coco));

        System.out.println("Valor m2: "+ String.format("%.2f",m2));  //Aquí hice que me tirase 2 decimales el resultado de media
        */


        int matriz1[]={1,2,3,4,5};
        matriz1=METODOS1.doblar(matriz1);
        METODOS1.imprimirArray(matriz1);

        METODOS1.doblar2(matriz1);

        METODOS1.imprimirArray(matriz1);


    //****************************************************************************
        //****************************************************************************
        //****************************************************************************
        //****************************************************************************






























    }
}
