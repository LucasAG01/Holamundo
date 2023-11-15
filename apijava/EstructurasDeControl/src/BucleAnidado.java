import java.util.Random;

public class BucleAnidado {
    public static void main(String[] args) {
                           //{}
        //* * * * * *
        //* * * * * *
        //* * * * * *

        //Quiero que genere 3 filas de 6 asteriscos

        int n=6; //Número de asteriscos
        int x=3; //Número de filas

      for(int j=0;j<x;j++){

        for(int i =0;i<n;i++){  //desde i=0 mientras i<n de uno en uno i contrala cuantas veces se ejecuta bucle
            System.out.print("* ");
        }
            System.out.println();
        }

        //Tengo que repetir este algoritmo x veces (filas)
        //Puede ser un while for dowhile...
        //He colocado el for(int j=0;j<x;j++) toca usar otra variable (j)/ mienstras j sea menor que x añade 1

        //El programa llega al 1 for, j vale 1, comrprueba la condicion del bucle de fuera, si se cumple, entra, y para j=1 se ejecuta lo de dentro
        //entra en el siguiente for



        //Ejemplo: Algoritmo que muestra todos los numeros primos de una matriz

        int matriz[]=new int[100];
        Random aleatorio=new Random();

        for(int i=0;i< matriz.length;i++){
            matriz[i]= aleatorio.nextInt(1,31);
        }

          //Ahora quiero detectasr numeros primos
          // Lo facil es el for its(each) pero usamos for xq si
        boolean primo= true;
        for(int i =0;i< matriz.length;i++){
            //Bucle que vaya desde 2 hasta matriz[i]/2 (a partir de la mitad de un número no hay más divisores)
            primo=true; //dentro del bucle que me recorre la matriz, por cada valor de la matriz me lo ponga true
            for(int j=2;j<=matriz[i]-1;j++){
                if(matriz[i]%j==0){  //que pasa si al dividir entre 2 da 0
                    primo=false; //Creo arriba un boolean indicando que si es primo así es, si entra aquí, no es primo
                    break;
                }
            }//cierra blucle de dentro
            //Ahora evaluo la variable primo
            if(primo){  //Ahora tengo que resetar la variable true si no queda viciada de la iteracion anterior
                System.out.print(matriz[i]+" ");
            }


        }



        //Usando el each   BARD GOOGLE
        for (int numero : matriz) {
            boolean Eprimo = true;
            for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    Eprimo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }














    }
}
