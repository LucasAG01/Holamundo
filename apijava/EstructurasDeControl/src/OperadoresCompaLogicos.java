public class OperadoresCompaLogicos {
    public static void main(String[] args) {

        //Operadores de comparación: <, <=,>, >=, ==, !=

        int x=4, y=5;
        boolean condicion1= x < y;
        boolean condicion2= x==y; // son iguales?
        boolean condicion3= x!=y; //devulve true si son distintos


        //Operadores lógicos && ---> Y lógico
        boolean condicion4= x<5 && x>0; // solo devukve true si los 2 son true


        // || --> O Lógico -->
        boolean condicion5= x<9 || x%3==0; //EXAMEN como el 1 operador es true va a devolver true independientemente
                                           //de la basura que haya después


        //No lógico !  va a negar lo que viene a continuación

        boolean c6= true;
        boolean c7= !c6;  //c7 valdra lo contrario de c6 en este caso valdra false.





    }
}