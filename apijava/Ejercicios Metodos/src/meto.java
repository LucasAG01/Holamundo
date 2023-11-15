import java.util.Arrays;

public class meto {
    //{}

    public static void printar(String mensaje) {
        System.out.println(mensaje);
    }
//***************************************************

public static int valorAlto(int...numeros){
    int ValorMax= numeros[0];
    for(int valor :numeros){
    if (valor>ValorMax){
    ValorMax=valor;
    }
    }
    return ValorMax;
}

public static float valorAlto(float...numeros){
    float ValorMax= numeros[0];
    for(float valor :numeros){
        if (valor>ValorMax){
            ValorMax=valor;
        }
    }
    return ValorMax;
}

//*********************************************************

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



    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void encontrarPrimosEnMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es un número primo.");
                }
            }
        }
    }



public static int contarPalabras(String mensaje){
        String[] palabra=mensaje.split(" ");
        int cuenta=palabra.length;
        return cuenta;
}


//************

    public static int[] doblar(int x[]){
        int copia[]= Arrays.copyOf(x,x.length); //Copio la matriz
        for (int i=0;i<x.length;i++){    //recorro la matriz
            copia[i]=x[i]*2;  // Duplica el valor actual en la matriz x y lo almacena en la matriz copia
        }
        return copia;
    }































}
