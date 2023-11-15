import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {

        int a,b,c;                    //{}
        double x1 = 0,x2=0;
        boolean solucion=true;
        a=2;
        b=-67;
        c=23;

        if(a==0){
            //bx+c=0; -->x1=x2=-c/b
            if(b==0){ //numero entre 0 no tiene solucion
                System.out.println("no solucion");
            }
            else{
                solucion=true;
                x1=x2=-c/b;
            }
        }//Final del caso a=0


        //Tuvimos que declarar las letras, el x1, x2 doubles=0 y el boolean que nos almacenará la soluciuon
        //tenemos que analizar el caso que propone, b no puede dar 0

        else if (b==0){
            //axcadrado+c=0 -->x1=+raiz(-c/a) x2=-raiz(-c/a)
            double radicando=-c/a;
            if(a==0){
                System.out.println("no tiene solucion");
            }
            if(radicando>0){
            System.out.println("No tiene solucion");
            }
            else{
                solucion=true;
                x1=Math.sqrt(radicando);
                x2=Math.sqrt(radicando);
            }
        }//Final b=0

        //Tuvimos ahora que declarar la variable Radicando que es la división a hacer y asignar los resultados x1 y x2 +-
        //Si el radicando es menor a 0 no hay solucion (raiz negativa)
        else if(c==0){

            if(a==0){
                System.out.println("no tiene solucion");
            }
            else{
                solucion=true;
                x1=0;
                x2=-b/a;
            }
        }//Final c=0
        //Creo el caso de si divides entre 0 no da nada y sino que haga lo suyo

        else{
            //acadrado2+bx+c=0 -->   x1 =-b+Raiz(bcadrado-4ac)/2a;  x2= -b-Raiz(bcadrado-4ac)/2a
            double radicando= b*b - 4*a*c;

            if(radicando<0){
                System.out.println("No tiene solucion");
            }
            else{
                x1=-b+Math.sqrt(radicando)/2*a;
                x2=-b-Math.sqrt(radicando)/2*a;
                solucion=true;
            }
        }//Final else

        //Como es la ultima cosa, ponemos el else solo, creamos el radicando para hacer las cosas fáciles
        //Si el radicando me da <0 no hay solucion CUANDO HAY UNA OPERACION QUE PUEDE NO DAR HAY QUE TENERLO EN CUENTA
        //Si no da menos de 0 que haga lo suyo
        //TRAS CADA OPERACION EXITOSA HAY QUE PONER EL BOLEAN DE LA SOLUCION TRUE

        //Evaluamos si hay solucion

        if(solucion){
            System.out.println("x1= "+x1);
            System.out.println("x2= "+x2);
        }



    }
}













