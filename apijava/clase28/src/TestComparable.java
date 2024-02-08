import java.util.Arrays;
import java.util.Comparator;

public class TestComparable {
    public static void main(String[] args) {

        Vehiculo flota[]=new Vehiculo[6];

        flota[0]=new Turismo("QWR4",50,60);
        flota[1]=new Formula1("FR56",50,90);
        flota[2]=new Avion("ER56",67,100);

        flota[3]=new Turismo("TY78",89,60);
        flota[4]=new Formula1("QK23",70,90);
        flota[5]=new Avion("OI92",70,200);



        //Quiero que me ordene el royo alfabeticamernte


        String codigos[]={"Zacarias","Manuel","Alejandro"}; //Alfabetico
        int notas[]={5,3,1}; //menor a mayor

        System.out.println("Explicacion compareTo: ");
        System.out.println(codigos[1].compareTo(codigos[0]));
        System.out.println(codigos[1].compareTo(codigos[1]));

        //La explicacion se utiliza para comparar dos objetos y determinar su orden relativo en funcion de algún criterio.
        //Me devuelve un nuemro positivo si el parametro pasado(2º) va antes que el que llamo

        Arrays.sort(codigos); //
        Arrays.sort(notas);

        System.out.println(Arrays.toString(codigos));
        System.out.println(Arrays.toString(notas));

        //Comparación vehiculos
        System.out.println();
        System.out.println("Resultado de compareTo con flota[0] y flota[1]");
        System.out.println(flota[0].compareTo(flota[1]));
        System.out.println(flota[0].getCodigo().compareTo(flota[1].getCodigo()));

        //Acelerearr
        flota[3].acelerar(7);
        flota[0].acelerar(12);
        Arrays.sort(flota); //odenacion natural de menor a mayor. //Overrride compareto vehículo. //SOL FUNCIONA SI NO
        //HAY POSICIONES VACIAS



        //OJO*/*/*/
        //Volcar a un Array todos los turismos
        //Contar cuantos turismos hay en el array{}
        int contadorTurismos=0;
        for(Vehiculo v: flota){
            if(v instanceof Turismo){
                contadorTurismos++;
            }
        }
        Turismo ts[]=new Turismo[contadorTurismos];
        int pos=0;
        for(Vehiculo v:flota){
            if(v instanceof Turismo){
                ts[pos]=(Turismo) v;
                pos++;
            }
        }
        Arrays.sort(ts);
        /////
        System.out.println();
        System.out.println("Turismo ordenados por velocidad:");
        for(Turismo t : ts) {
            System.out.println(t);
        }
        System.out.println();


        for (Vehiculo v:flota){ //Con esto me comprara por codigo.
            if(v==null)
                break;
            System.out.println(v);
        }



    }
}
