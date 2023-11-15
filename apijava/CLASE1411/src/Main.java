import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Motor m= new Motor();  //Si no pongo new al llamr constructor NO estoy creando ningun objeto. 1* //Construcor default.
        Motor m2= new Motor(45,180,TipoMotor.Gasolina);

        //Mostrar info por consola m2 to.String

        System.out.println(m2.toString());

        Coche c1=new Coche();
        Coche c2=new Coche("12334YUT", LocalDate.of(2018, Month.DECEMBER,12),"Nissan","Primera",23000,m2); //m2 es el motor que he creador arriba.
        Coche c3=new Coche("43545UTY",LocalDate.of(2019,Month.DECEMBER,23),"Ferrari","SF90",788889,new Motor(123,3244,TipoMotor.Hibrido));
        //En coche c3 he creado el motor sobre la marcha, el mator de c3 no se puede modificar desde fuera.
        //Con el contrucor Coche nuevo de l30 Coche
        Coche c4=new Coche("321213OI",LocalDate.of(2023,Month.JUNE,23),"Porsche","Caiman",123444,123,400,TipoMotor.Gasolina);

        //Cambiar litros de aceite en c2:
        m2.setLitrosAceite(0);
        c2.getMotor().setLitrosAceite(20); //Como el objeto esta creado arriba puedo hacerlo de esta forma. LOS 2 APUNTAN AL MISMO OBJETO

        //Cambiar litros de aceite en c3:
        c3.getMotor().setLitrosAceite(80); //Solo puedo acceder a los datos del motor si escribo " objeto.get(clase).set(loque cambio)(datos); "

        //Cambiar tipo motor en c3:
        c3.getMotor().setTipoMotor(TipoMotor.Gasolina);

       //Cambiar motor en c3:
        c3.setMotor(new Motor(34,300,TipoMotor.Electrico));

        //O puedo programar un método que reciba 2 enteros y un tipo de motor y que lo cambie.
        c3.getMotor().cambiarMotor(34,700,TipoMotor.Diesel); //método en Motor.



    }
}