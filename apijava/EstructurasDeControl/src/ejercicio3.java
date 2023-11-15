import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {

        //{}  CALCULAR MENOR DE 4 NUMEROAS


        int a,b,c,d,menor = 0;

        a=12;
        b=3;
        c=45;
        d=1;

        if(a<b){
            menor=a;
        }
        else{
            menor=b;
        }
        //Si a es menor que b
        if (menor>c){
            menor=c;

        }//Si menor es mayor a c
        if(d<menor){
            menor=d;

        }//Si d es menor que "menor"
        System.out.println(menor);


    }
}
