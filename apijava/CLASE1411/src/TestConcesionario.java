import java.time.LocalDate;
import java.time.Month;

public class TestConcesionario {
    public static void main(String[] args) {

        Concesionario montecastelo=new Concesionario("Coches Fantasticos",20);
        montecastelo.addCoche(new Coche("2112313UY", LocalDate.of(2344, Month.APRIL,3),"kia","honda",234455,323,423,TipoMotor.Gasolina));
        montecastelo.addCoche(new Coche("12321313Y", LocalDate.of(2012, Month.APRIL,3),"kok","nib",799995,33,500,TipoMotor.Electrico));
        montecastelo.addCoche(new Coche("7676143UY", LocalDate.of(2013, Month.APRIL,3),"wow","nib1",3455,23,700,TipoMotor.Hibrido));
        montecastelo.addCoche(new Coche("9478313UY", LocalDate.of(2014, Month.APRIL,3),"kek","ne2",64455,67,800,TipoMotor.Diesel));
        montecastelo.addCoche(new Coche("43545UTY",LocalDate.of(2019,Month.DECEMBER,23),"Ferrari","SF90",788889,new Motor(123,3244,TipoMotor.Hibrido)));

        //Método que me imprima toda la información de un concesionario por consola

        System.out.println(montecastelo);

        //Buscar coches por matriicula

        Coche c=montecastelo.getCocheByMatricula("2112313UY");
        System.out.println("****************************");

        //Esto lo hago en la clase esta.

        System.out.println("Coche de matricula: 2112313UY" );
        if(c==null){
            System.out.println("No se encuestra matricula");
        }else{
            System.out.println(c);
        }

        //Eliminar un coche del concesionario
        boolean eliminado= montecastelo.deleteCoche("7676143UY");
        montecastelo.deleteCoche("7676143UY");

        System.out.println();

        if(eliminado){
            System.out.println("Después de eliminar coche 7676143UY");
            System.out.println(montecastelo);
        }
        else{
            System.out.println("No se encuetra el vehiculo especificado");
        }
































    }
}
