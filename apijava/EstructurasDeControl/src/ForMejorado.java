public class ForMejorado {
    public static void main(String[] args) {
        //{}
      int matriz[]={1,4,0,2,1,0,7,9};

      //Si quiero recorre la matriz con un for normal

        for (int i=0;i< matriz.length;i++){

        }


        //En algunas ocasiones se puede utilizar otro tipo de for

        //Para recorrer colecciones de datos (arrays) desde el princio a final y para operaciones
        //de solo lectura, podemos usar el siguiente for

        for(int valor : matriz){            //Se lee como un POR CADA //Va copiando 1x1 cada valor que hay en al amtriz siempre desde la posicion 0 hasta la última y lo copia en la variable "valor"
            System.out.print(valor+" ");
        }

        //Este for no puede modificar la matriz de datos, es decir, si el ej me dice(recorrer matriz y donde hay 0 poner 1)
        //NO PUEDO USAR EL FOR int

        //Ejercicio: Modificar posiciones que almacenen 0 y sustituirlas por 1.

        for(int valor: matriz){
            if(valor==0){          // ESTO NO SIRVE, AQUI ESTOY LEYENDO, NO MODIFICANDO
                valor= 1;
            }
        }

        for (int i=0;i< matriz.length;i++){
            if(matriz[i]==0){                //SIRVE
                matriz[i]=1;
            }
        }
        System.out.println();
        for(int valor:matriz){
            System.out.print(valor +" ");
        }


















    }
}
