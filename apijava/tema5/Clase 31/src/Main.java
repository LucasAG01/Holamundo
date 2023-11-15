public class Main {
    public static void main(String[] args) {
//{}
      String prueba="rtydd";
      if(MetodosString.validarString(prueba)){
          System.out.println("Correcto");
      }
      else {
          System.out.println("Incorrecto");
      }

    //Metodo ej 2

        String prueba2="Hola caracola";
        int contadorCaracter=MetodosString.contarOcurrencias(prueba2,'a');
        if(contadorCaracter==0){
            System.out.println("El cacarter no está en la cadena");
        }
        else{
            System.out.println("La a aparece "+contadorCaracter+ " veces.");
        }

    //Metodo ej 3

        String mensaje="Hola tengo dos vocales";

        System.out.println(MetodosString.cuentaPalabrasDosVocales(mensaje));

    //Método 4
        int primeraAparicion=MetodosString.buscaCaracteres("Morcego",'a','e','i');
        //Busca estos carcteres y el primero que encuentre, me dara la posicion del 1º
        System.out.println(primeraAparicion);




































    }
}