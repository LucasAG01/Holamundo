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

        System.out.println(c4.toString());


        //Matrices de coches

        Coche misCoches[]=new Coche[100]; //No estoy creando 100 coches, son 100 referencias de tipo coche(todas null).

        //Para apuntar a un coche tengo que crearlo
        misCoches[0]=c2;
        misCoches[1]=new Coche("43545UTY",LocalDate.of(2019,Month.DECEMBER,23),"Ferrari","SF90",788889,new Motor(123,3244,TipoMotor.Hibrido));
        misCoches[2]=new Coche("321213OI",LocalDate.of(2023,Month.JUNE,23),"Porsche","Caiman",123444,123,400,TipoMotor.Gasolina);
        misCoches[3]=new Coche("3423432UY",LocalDate.of(2533,Month.APRIL,30),"kys","nigg",445,m2);
        System.out.println(misCoches[0]);  //Se ejecuta bien porque he creado el contructor de coche.

        //Guadar c1 en la primera posicion vacía.

        for(int i=0;i< misCoches.length;i++){
            if(misCoches[i]==null){ //Si mis ciches d ei es null (vacia)
                misCoches[i]=c1;  //Guiardo c1
                break; //Salgo porque sino estaria guardando en null c1.
            }
        }

        //Calcuar el precio total de los coches de la matriz.

        float sumaTotal=0;
        for(Coche c:misCoches){
            if(c!=null){
            sumaTotal=sumaTotal+c.getPrecio();       //ALGORITMOS COMO ESTOS VAN A CAER EN EL EXÁMEN
        } else{
                break;
            }
        }
        System.out.println("Precio total de los coches: "+sumaTotal+" euros"); //Cannot invoke "Coche.getPrecio()" because "c" is null --> hay espacios null en la matriz.


    }
}