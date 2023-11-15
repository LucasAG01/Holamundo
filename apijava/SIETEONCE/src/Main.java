public class Main {
    public static void main(String[] args) throws Exception {
        //Crea variables de tipo alumno
        Alumno a1,a2,a3;  //Alumno es una variable compleja, a1 es una referencia a la zona de memoria donde están los datos

        //Asociar referencia con objeto --> Instanciar
        //-->Operador new

        a1 = new Alumno(); //--> Se ha creado un objeto en memoria de tipo alumno.
        a2=new Alumno("Maria",23,"12345678U");  //Con el constructor creado.
        a3=new Alumno("juan",24,"2334343W");

        //Para acceder a los atributos de un objeto, utilizaremos el operador.
        //MOstrar la edad de a1
        System.out.println("Edad de a1: "+a1.getEdad()+"       Nombre se se declara como : "+a1.getNombre());

        //Modificar la edad:
        a1.setEdad(19);
        //Modifircar nombre y DNI
        a1.setNombre("Pedro");
        a1.setDNI("12345678R"); //EL SET

        //NOTA:   Cuando creo un String puedo hacerlo sin new o con new.

        //Es mayor de edad?
        if(a1.esMayorEdad()){ //El metodo depende de los datos de donde estoy llamando.
            System.out.println("Es mayor de edad.");
        }
        else{
            System.out.println("No es mayor de edad.");
        }


        //Llamada a métods heredados de la clase Object
        //a1.toString();  //pasar a String los datos que contiene un objeto.   de primeras sin nada, no me da nada.
        System.out.println(a1); //Como herede el toString de Alumno l.45
        System.out.println("Hascode: "+a1.hashCode());
        System.out.println("Hascode: "+a2.hashCode());  //El hascode en futuro definira criterios de igualdad entre objetos. tema9
        System.out.println("Hascode: "+a3.hashCode());

        boolean iguales=a2.equals(a3);
        System.out.println(iguales);  //Hascode diferente x lo que sale false.


        //Mostrar DNI por pantalla
        System.out.println(a1.getDNI());

































    }
}