public class While {
    public static void main(String[] args) {

        //Los bucles me permiten repetir intrucciones de codigo mientras se cumpla una determinada condicion

        //3 partes y 1 variables de control
        //1. Inicializacion de la variable de control
        //2. Condicion de continuidad -→ Variable de control (receta ayuda opcional)
        //3. Modificar la variable de control


    //Ejemplo 1: Mostrar por consola los 10 primeros numeros

        int i=1;  //Nombre default de la variable de ocntrol iniciada al 1 numero por pantalla

        while(i<=10){                 //mientras la i sea menor o igual 10 ejecuta
            System.out.print(i+ " ");
            i=i+1; //i++; i+=1; va aumentando 1 unidad hasta llegar al límite
        }

    //Ejemplo 2: Mostrar el primer valor múltiplo de 3 y 7 entre n y m

       int n=900, m=13000;

        //quiero hacer un bucle que vaya de N a M, me evalue los valores multiplos de 3 y 7
        // y me muestre solo el primer valor

        int j= n;  // creamos variable de control

        while(j<=m){ //mientras el numero que salga sea menor que M (máximo)

            if(j%3==0 && j%7==0){
                System.out.println("primer multiplo de 3 y 7" +j + " ");
                break; //Esencial poner break dentro de if
            }
            j++; //Variable de control NUNCA dentro del if
        }



    //Ejemplo 3: Contar numeros negativos en un matriz

        int matriz[]={9,0,-3,8,2,-1};

        //Quiero contar CUANTOS nºs negativos hay en la matriz
        //Recorrer todas las posiciones
        //NOTA OFFTOPIC: si hago un else if solo entro 1 vez ahí, quiero que independientemente del resultado de arriba, siga hacia abajo

        int k=0; //variable de control que inicializo en  la primera posicion de matriz a analizar
        int contador=0;
        //Quiero que la k llegue hasta la última posición de la matriz

        while (k< matriz.length){
            if(matriz[k] < 0){  //ahora neceitare ir contando, tengo que almacenarlo en una variable , por eso //voy arriba a donde los int para escribirlo
                contador++; //Si hay un negativo, me lo amlacenará

            }
            k++; // tras haber visto la posicion 0, aumenta 1 al valor de k y vuelta
        }
        System.out.println("Hay "+contador+" Numeros negativos");




    //Ejemplo 4: Sumar los valores de la matriz que son pares.

        int suma =0;
        int z=0; //variable de control

        while(z< matriz.length){ //no queremos que la posicion indicada supere a la longitud de nuestra matriz
            if(matriz[z]%2==0){ //si matriz de z al dividirlo entre 2 da 0
                suma = suma+matriz[z]; //quiero que la variable suma aumente cogienzo valor matriz z, es decir, que suma sea igual a lo que valia suma(0)+ matriz de z
            }
            z++; // tras haber visto la posicion 0, aumenta 1 al valor de z y vuelta
        }
















    }
}
