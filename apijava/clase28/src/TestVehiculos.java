import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class TestVehiculos {
    public static void main(String[] args) {

        Acelerable flota[]=new Acelerable[100];





        flota[0]=new Turismo("QWR4",50,60);
        flota[1]=new Formula1("FR56",50,90);
        flota[2]=new Avion("ER56",50,100);

        flota[3]=new Turismo("TY78",70,60);
        flota[4]=new Formula1("QK23",70,90);
        flota[5]=new Avion("OI92",70,200);

        /*flota[6]=new Leopardo("Manin");
        flota[7]=new Planeta();  //Puedo aádirlos porque se pueden acelerar*/




         //Acelerar todos los vehículos

        for(Acelerable v:flota){
            if(v==null){ //En la matriz hay valores null, por lo que para que no salte un error, hay que cambiar esto.
                break;
            }
            v.acelerar(2); //Cada uno acelerará de una manera //Referencia de tipo vehiculo, accede al metodo acelerear y ahi cambia.
        }

        //Mostrar estado actual de la flota:

        for(Acelerable v:flota){
            if(v==null){ //En la matriz hay valores null, por lo que para que no salte un error, hay que cambiar esto.
                break;
            }
            System.out.println(v);
        }


        //Modificar la aaltura de vuelo de todos los aviones en 500

        for(Acelerable v:flota){
            if(v==null)
                break;

                //Convertir v en avion CUIDADO !!!! Peligro!!!  (downcast) CONVERITR REFERENCIA TIPO BASE EN HIJA.
                if(v instanceof Avion){
                Avion vcopia=(Avion) v; //Estoy creando una referencia de tipo avion para que apunte a v, pero en la flota hay ocsas que no son aviones
                vcopia.modificarAlturaDeVuelo(500); //Primero hay que comprobar si v apunta a un avion. (instanceof)
                }
        }


        System.out.println();
        System.out.println("Después de modificar altura de aviones: ");
        System.out.println();

        for(Acelerable v:flota){
            if(v==null){ //En la matriz hay valores null, por lo que para que no salte un error, hay que cambiar esto.
                break;
            }
            System.out.println(v);
        }

        //Creo calse aniaml y leopardo.
        //Ahora supongamos que deseo almacenar en la matriz flota, cualquier cosa que pueda ser acelerada
        //Voy a añadirle a leopardo velocidad.

        //No puedo hacer que leopardo herede de vehículo, ya que leopardo este ya hereda de animal. y no puedo hacer que aniaml eherede de vehículo ayq ue
        //no quiero que tengan codigo.
        //Solucion, crear interfaz que contenga esa funcionalidad clic derecho clases e  ******INTERFAZ******

        //Ahora cree la interfaz acelerar donde colo que la calse abstracta creada en vehículo
        //Voy a vehículo y coloco arriba implements acelerar.
        //Puedo implementar a una clase todas las interfaces que desee.{}


        //Voya a crear una clase llamda planeta que pueda ser Acelerable.(Pra ver que la flota voy añadiendo cosas)
        //Puedo añadir a la flota planetas y leopardos porque son acelerables ambos.

        //INTERFAZ sirven para definir funcionalidades que son comunes o que quiero que sean comunes a clases
        // que no están relacionadas por herencia, es la estrategia que me fda java para simular la herencia multiple de forma más segura.

        //Las interfaces no salen nada más empezar.

        //Si al crear mi nueva flota, pongo vehículo en vez de acelerable, solo podre poner vehculos
        //Al principio la llame vehículo porque era lo que tenía.

        //Cambiar nivel de aceite a los Fórmula 1

        for(Acelerable v : flota) {
            if(v instanceof Formula1) {
                ((Formula1)v).setNivelAceite(100);
            }
        }

        for(int i = 0;i<flota.length;i++) {
            if(flota[i]==null)
                break;
            if(flota[i] instanceof Formula1) {
                ((Formula1)flota[i]).setNivelAceite(100);
            }
        }






    }
}