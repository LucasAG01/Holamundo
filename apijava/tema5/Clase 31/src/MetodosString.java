public class MetodosString {

//1. Método que recibe un String y comprueba que empieza por mayuscula y
    //contiene al menos un dígito{}

    public static boolean validarString(String mensaje){
        boolean contieneDigito=false;
        boolean empiezaPorMayuscula=false;
        boolean correcto=false;
        //Voy a vompraobar si empieza por mayuscula, si es así le pongo true, sino se queda en false

        if (Character.isUpperCase(mensaje.charAt(0))){ //Si es una mayuscula(primero mensaje.char at) o si mepieza por miniscula poenr alaten un !
            empiezaPorMayuscula=true;
        }

        for(int i=0;i<mensaje.length();i++){ //Recorre el mensaje
            if(Character.isDigit(mensaje.charAt(i))){ //Si encunetra un dígito
                contieneDigito=true;
                break;
            }
        }
        return empiezaPorMayuscula && contieneDigito; //fuera del for
    }



//Hacer por ejemplo que compruebe si contiene una a y 2 espacios



//2. Método que recibe un string y un char y cuenta las apariciones del char en el String

public static int contarOcurrencias (String frase,char caracter){
        int contador=0;  //cuando me piede contar pongo contador de 1ras
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)==caracter){
                contador++;
            }
        }
        return contador;
}


    //3. Método que recibe un String y cuenta las palabras que contienen al menos 2 vocales     ¡OJO!
   //Cuando tengo que ir palabra por palabra hay que hacer un split
    public static int cuentaPalabrasDosVocales(String mensaje){
        //Obetener palabras
        String palabras[]=mensaje.split(" ");
        int palabrasCon2Vocales=0; //contador

        for(String pal:palabras){
            int contadorVocales=0;
            for(int i=0;i<pal.length();i++){
                if(pal.charAt(i)=='a'||pal.charAt(i)=='e'||pal.charAt(i)=='i'||pal.charAt(i)=='o'||pal.charAt(i)=='u' ){
                    contadorVocales++;
                }
            }//Cierra el for interior
            if(contadorVocales>=2){
                palabrasCon2Vocales++;
            }
        }
        return palabrasCon2Vocales;
    }


//4. Método que recibe un String y un número opcional de chars , busca los chars en el string y   NO ENTRA PUTA SALVAJADA
    //devuelve la posición de la primera aparición

   public static int buscaCaracteres(String mensaje,char c,char...letras){ //Le paso un string un cracater y uno n deter de caracteres. 2ºesto

        int posicionPrimerCaracter=buscarCaracter(mensaje, c);
        int posicionPrimeraOpcional=-1;
        for(char letra :letras){
            posicionPrimeraOpcional=buscarCaracter(mensaje,letra);

        }
       return posicionPrimerCaracter;
   }//No se hacerlo
    //hare un método que me busque un caracter lo usare de apoyo para hacer el de arriba /lo hare privado 1ºesto

   private static int buscarCaracter(String mensaje,char c){
        for(int i=0;i<mensaje.length();i++){
            if(mensaje.charAt(i)==c){                                   //Esto se puede acmbiarpor Indexof()    //String str = "Hola mundo";

                                                                                                                //int index = str.indexOf('a');

                                                                                                               // System.out.println(index); // 2
                return i; //Los [] son para Arrays numericos
            }
        }
        return -1; //Esto en el casod e quye no lo encuentro
   }












































}
