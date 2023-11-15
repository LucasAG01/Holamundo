public class SentenciaSeleccionMultiple {
    public static void main(String[] args) {

     //Sentencia Mlutiple
     //Programa que indica si un numero es múltiplo de 3

     int numero=9; //voy a evaluar un número


     if(numero%3==0){ //Si el numero al dividirlo entre 3 me da 0
         if(numero%5==0){
             System.out.println("Múltiplo de 3 y 5");
         }
         else {
             System.out.println("Multiplo de 3 y no de 5");

         }

     } //Pueda anidar if dentro de otrs if
     else if (numero%5==0) { //Si el programa entra aquí es porque no se cumple lo de arriba
         System.out.println("Mlutiplo de 5 no de 3");
     }
     else if (numero%7==0) {
         System.out.println("Multiplo de 7, ni 3 ni 5");

     }
     else { //Buena práctica es que el ultimo sea un else
         System.out.println("Ni de 3,5,7");

     }


    }
}
