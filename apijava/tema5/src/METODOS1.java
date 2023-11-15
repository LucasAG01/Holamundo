import java.util.Arrays;
import java.util.Random;

public class METODOS1 {
//Lo hago y luego lo borro
//Aqui creo mis cosas, y las copio en otro.
// Ejemplode de metodos con numeros

//atributo de acceso:
//public ---> Se puede ejecutar desde cualquier clase del proyecto
//private --->Se puede ejecutar desde la misma clase
//protected ---> Se puede ejecutar desde cualquier clase hija.
//Por defecto----> Se puede ejecutar desde cualquier clase del mismo paquete

public static boolean esPar(int n){ //No ahy nada que geemer boolen x eso llora al principo

    if(n%2==0){
        return true;
    }
    else{
        return false;
    }
}

public static boolean esCero(int n){
    if(n==0){
        return true;
    }
    else{
        return false;
    }
}


//Método que devulve la media de un array de enteros
public static double calcularMedia(int []m){
        int suma=0;

        for(int valor : m){
            suma=suma+valor;
        }
        return (double) suma /m.length;

    }


//luego en un ejercicio solo pondria  {}
     //double media=METODOS1.calcularMedia(matriz);


public static void mostrarArray(int[] x){
    for(int i:x){
        System.out.println(i +" ");
        }
    System.out.println();

}

static int suma(int x, int y){
    return x+y;
}

static void MostrarMensaje(){
    System.out.println("Hola caracola");
}

static double calcularMedia1(int x1,int y1,int z1){   //{}
    double media=(x1+y1+z1)/3;
    return media;
}

static void resetear(int numero){
    numero=0;                                //NO RESETEA
}

static int resetear1(){
    return 0;
}




    static double calcularMediaaa(int ...numeros) {
        double suma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i];
        }

        media = suma / numeros.length;
        return media;
    }



    //METODOS QUE TRABAJAN CON MATRICES  {}

    static int[] imprimirArray(int[] x) {
        for(int i:x) {
            System.out.print(i + " ");
        }
        System.out.println();
        return x;  //return lista de numeros
    }



static int[] doblar(int x[]){
    int copia[]= Arrays.copyOf(x,x.length);
    for (int i=0;i<x.length;i++){
        copia[i]=x[i]*2;
    }
    return copia;
}

static void doblar2(int x[]) {
    for (int i=0;i<x.length;i++){
        x[i]*=2;
    }
}

        //Solar un mensaje
        public static void printar(String mmensaje){
            System.out.println(mmensaje);
        }


    //Máximo numero en una lista de ints
    static int maximo(int ...numeros){
            int maxi=numeros[0];

            for(int n : numeros){
                if(maxi<n){
                    maxi=n;
                }
            }
        return maxi;
    }



 //Máximo nuemro en una lista de doubles
    static double maximo(double ...numeros){
        double maxi=numeros[0];

        for(double n : numeros){
            if(maxi<n){
                maxi=n;
            }
        }
        return maxi;
    }

    //Rellenar matriz numeros aleatorios
static void rellenarMatriz(int[] x){
    Random aleatorio=new Random();

    for(int i=0;i<x.length;i++){
        x[i]=aleatorio.nextInt();
    }
}

static void rellenarMatriz(float[] x){
        Random aleatorio=new Random();

        for(int i=0;i<x.length;i++){
            x[i]=aleatorio.nextFloat();
        }
    }



        //Printar una matriz
    public static void imprime(int n[]){
    for(int numero :n){
        System.out.print(numero+ " ");
    }
        System.out.println();

    }

    public static void imprime(float n[]){
        for(float numero :n){
            System.out.print(numero+ " ");
        }
        System.out.println();

    }


    //Método primo







    public static void priimo(int ...numeros){
    for(int n:numeros){
        int contador=0;
        for (int i=2;i<=n;i++){

            if(n%i==0){

                contador++;
            }

        }

        if (contador==1){
            System.out.println(n+" Primano");
        }

    }
    }


//COntar palabras kys
    public static int contarpalabras(String x){
        System.out.println(x);
    String[] separacion=x.split(" ");
        int palabras=separacion.length;
        return (palabras);

    }










































    }

