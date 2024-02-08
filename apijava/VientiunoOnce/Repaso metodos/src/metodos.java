public class metodos {


    //Métdo mcm 3 numros{}

    public static int minimo(int n1,int n2,int n3){
        //Descomponer en factores primos
        int mcm=1; //lo que queremos que devulva
        int divisor=2; //inicializamos undiviisor a 2

        while(n1>1||n2>1||n3>1){ //Bucle que ejecuta mientars al menos uno de los numero sea mayor a 1
            if(n1%divisor==0||n2%divisor==0||n3%divisor==0){ //Verificamos si el divisor es primo
                mcm*=divisor; //si es primo, multiplicamos mcm por dicosr y dividimos por divsor
                if(n1%divisor==0)n1/=divisor; //Dividivos n1 por divisor si es divisible por este
                if(n2%divisor==0)n2/=divisor;
                if(n3%divisor==0)n3/=divisor;
            }else {
                divisor++; // Si no es primo aumentamos divisor, para probra con el siguiente número.
            }
        }
        return mcm;
    }


    //Maximo comun divisor, pero usando el método Euclides.donde se reemplaza iterativamente a n2 con el resto de la division  de n1 /n2 y este pasa a n1.

    public static int mcd(int n1,int n2,int n3){
        while (n2!=0){ //mienstras n2 sea distinto de 0,  calcula el resto de la division de n1 y n2.
            int temp=n2; //variable temporal asignada a n2
            n2=n1%n2; //n2 pasa a valer el resto de n1/n2
            n1=temp; //n1 pasa a valer lo que valia n2, por lo que aacabara teniendo el valor maximo comun.
        }
        return n1;
    }


    public static int facotrial(int n){
        if (n==0||n==1){ //Al principoio debemos hacer lso if con la cosa sencilla, en este caso si es 0 o 1 da 1
            return 1;
        }else { //Sino... lo gordo
            return  n*facotrial(n-1); //el factorial es el número multiplicado por el factoial del numeor anterior.
        }
    }

    public static int factorial1(int n){
        int factorial=1;
        for (int i = 1; i <n ; i++) {
            factorial*=i;
        }
        return factorial;
    }


    //La expresión matemática C(m, n) en el mundo de la teoría combinatoria de los
    //números, representa el número de combinaciones de m elementos tomados de
    //n en n elementos.


    //Inidicar si un nomero es primo

    public static boolean primo(int n1){
        if(n1<=1){
            return false;
        }
        if (n1<=3){
            return true;
        }
        if (n1%2==0||n1%3==0){
            return false;
        }
        for (int i = 5; i*i <=n1 ; i+=6) { //i*i<=n1 mientras el valor de i al cuadrado sea menor o igual al valor de numero. Por ejemplo, si numero es 10, el bucle continuará ejecutándose hasta que i alcance 4.
            if(n1%i==0||n1%(i+2)==0){ //COmprobamos si una de estas es verdaddera  1(el numeor es divisible por i) 2(numeor es divisible por i+2)
                return false;
            }
        }
        return true;
    }





    
}
