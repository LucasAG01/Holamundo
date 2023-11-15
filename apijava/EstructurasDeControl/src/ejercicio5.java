public class ejercicio5 {
    public static void main(String[] args) {

        //Calcular la desviacion media   {}

    int matriz[]={1,3,5,6,7,8,9,0 };
    double media=0,desviacionMedia=0,suma=0;
    short contador=0;
    double desviaciones[]=new double[matriz.length]; //
    //calculamos la media

        for(int i=0;i<matriz.length;i++){
            suma=suma+matriz[i]; //suma los valores de la matriz
        }
        media=suma/matriz.length;


        //Contamos valores por encima de la media

        for(int valor:matriz){ //Para leer matrices POR CADA.
            if(valor>media){ //Si el valor es mayor a la media se suma 1
                contador+=1;
            }
        }

        System.out.println("La media es: "+media);
        System.out.println();
        System.out.println("Hay "+contador+" valores por encima de la media");
        System.out.println();


        //Para calcular la desviacion media, calculamos la desviación
        //de cada valo y almacenamos el resultado en la matriz de desviaciones

        //Tengo que declarar arriba la matriz desviaciones como double.
        for(int i=0;i<matriz.length;i++){
            desviaciones[i]=Math.abs(matriz[i]-media);
        }

        //Mostramos el array desviaciones para comprobar
        for(int i=0;i<desviaciones.length;i++){
            System.out.println("Desviacion del valor de la posicion "+i+" "+desviaciones[i]);

        }

        //Calcualo de la desviacion media (La media de las desviaciones)

        suma=0; //declaramos suma

                for(int i=0;i<desviaciones.length;i++){  //recorremos la matriz desviaciones
                    suma=suma+desviaciones[i];           //Sumamos sus valores
                }
                desviacionMedia=suma/desviaciones.length;  //DesviacionMeda(declarada arriba)=suma desviaciones/longitud matriz
        System.out.println("Desviacion media= "+desviacionMedia);










    }
}
