import java.util.Random;

public class For {
    public static void main(String[] args) {

        //Esto es más comodo a la hora de recorrer matrices

        //Las 3 partes se hacen en 1 unica linea
        //for(inicialización; condicion; modificacion){ }


   //Ejemplo 1: Contar los divisores de un número n

        int n=947;
        //Si quiero contar los divisores tengo que ir dividiendo entre 1,2,3,4...17(n numeros)
        //Necesito una variable que vaya dessde 1 hasta 947 que será la variable de control del bucle
        int contador=0;  //en el mometo en el haya que contar u ordenar, hay que crear la variable de almacenaje
        for (int i=1;i<=n;i++){ //declaro de donde partimos ; quiero que vaya de 1 a 17 ; vaya de 1 en 1

            if(n%i==0){  //si divido n entre i y el resto me da 0
                System.out.print(i+" ");
                contador++; //si cada vez que pasa lo del if, le sumo uno al contador
                break; //optimizamos algoritmo
            }

        }
        System.out.println("Cantidad divisores: "+contador);

        if(contador==2){ //Aqui le doy el caso en que si el numero tiene 2 divisores, el numero es primo
            System.out.println("Numero primo");
        }
        else { //SI NO tiene 2 divisores, no es primo
            System.out.println("Número no es primo");
        }


    //Ejemplo 3: Llenar un matriz con numeros aleatorios entre 1 y 100. calcularemos la media

        int matriz[]=new int[100];
        Random aleatorio=new Random();
        //Deseo recorrer la matriz e ir metiendo valores aleatorios

        for(int i=0;i<= matriz.length;i++){
            matriz[i]=aleatorio.nextInt(1,101); //exclusive, tengo que sumar 1 si quiero que llegue a 100
        }
        //Pasamos a calcular media
        int suma=0;
        double media;

        //Para realizar la suma, tengo que crear otro bucle
        for (int i=0;i< matriz.length;i++){
            suma=suma+matriz[i];
        }
        media=suma / matriz.length;

        //Para cada cosa un bucle.




























    }
}
