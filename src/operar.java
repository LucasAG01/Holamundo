public class operar {
    public static void main(String[] args) {
     // PSVM PARA CREAR UNA NUEVA CLASE sout para un System.out.imptln


    //Operador asignación (=)
        int a=5;
        int b=a + 6;
        System.out.println(a + b);

    //asignaciones múltiples permitidas
        int c,d,e;
        c=d=e=0;
        System.out.println(d);

    //Operador + puede realizar dos funciones
        //Suma variables numéricas
            int numero=10;
            int resultado=numero + 20;

        //Concatena texto y variables
        System.out.println("El resultado es " + resultado );

    //conversion numérica
        short y = 9;
        int x = 5;
        int z = x+ y;

        byte b=9;
        byte cc=5;
        int dd=b + cc;

        int entero=10;
        float flotante=3;
        float res=entero*flotante;

    //Operador cociente Este operador devuelve un número entero si los números que divide son enteros,aunque el resultado no sea entero
        int n1=10;
        int n2=3;
        int cociente= n1/n2;
        System.out.println("n1/n2=" + cociente);
        //El resultado en la consola es n1/n2=3


    //Operador módulo % calcula el resto de la division entera.
        int resto=10%2;
        int x=6;
        int y=5;

        int resto2=x%y;

        System.out.println("Resto=" +resto+"\n"+"Resto2="+resto2);
        //El resultado en la consola es Resto=0
        //Resto2=1


    //Operadores += , -= ,*= , /= Forma reducida de expresar las operaciones de suma , resta ,multiplicación y división sobre una variable

        x = x + 1 →  x+=1

        x = x - 1 →   x-=1  //la flecha indica a que equivale el royo

        x =  x * 2 →  x*=2

        x = x / 2 → x/=2


    //Operadores ++ y -- Estos operadores se utilizan para AUMENTAR o DISMINUIR en UNO el valor de la variable sobre la que se aplican.
    //En función de si van situados antes o después de la variable modifican ligeramente su comportamiento.

        int x=5;  →   //x vale: 6
        int y=++x; →  //y vale: 6

        int x=5; →    //x vale:6
        int y=x++; →  //y vale:5
//***************************

    //Prioridad operadores aritméticos.
        //El producto y el cociente tienen más prioridad que la suma o la resta:
        // a + b*c  →  a + (b*c).  No serían necesario los paréntesis

        //Sin embargo , si queremos efectuar antes la suma sí serían necesarios:
        // (a + b) * c

        //Otro ejemplo, para realizar la operación a entre b*c , tendremos que escribir
        // a / (b*c) .

//*************************

        // Conversiones implícitas Las conversiones automáticas se producen si:
        //Los dos tipos son compatibles
        int entero=4;
        //El tipo de destino es mayor que el de origen
        long largo=entero;

        //En el siguiente diagrama las variables de la izquierda se pueden convertir automáticamente a cualquiera de la derecha: byte –> short –> int –> long –> float –> double

//*************************

        //Conversiones explícitas.
            //En muchas ocasiones nos va a interesar almacenar el valor de una variable en otra de menor tamaño, y para ello necesitamos forzar esta conversión ya que como hemos visto no se hace de forma automática. (tipo_destino) expresión;
            //posible pérdida de información
        double x = 9.5;
        float y = (float)x;
                    //Resultado en la consola haciedo print (r) : 9.5
        double num1 = 9.56;
        double num2 = 3.54;
        int division2 = (int)(num1/num2);
                    //Resultado en la consola haciendo print (division2) : 2


//**************************
        //Ponemos final al principio del dato al declarar para que este no se pueda cambiar más

        final int MAXIMO=4;


    }
}
