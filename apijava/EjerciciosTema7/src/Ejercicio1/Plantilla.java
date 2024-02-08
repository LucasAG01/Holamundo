package Ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Plantilla {
    public static void main(String[] args) {

        Plantilla[] Plantilla1 = new Plantilla[10];

        int opcion=0;
        boolean salir=false;

        do {

        System.out.println("1.Guardar empleado");
        System.out.println("2.Guardar Directivo");
        System.out.println("3.Guardar Administrativo");
        System.out.println("4.Guardar operario");
        System.out.println("5.Salir");

        opcion=new Scanner(System.in).nextInt();




        switch (opcion){
            case 1:
                    //Guardar empleado
                Scanner intr=new Scanner(System.in);
                System.out.println("Introduzca datos empleado");
                System.out.println("DNI: ");
                String DNI=intr.nextLine();

                System.out.println("Introduce la fecha de nacimiento: dd/mm/yyyy");
                String fechaNcacimiento=intr.nextLine();

                //Pasar String Fecha nacimiento a localdate

                DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaNac=LocalDate.parse(fechaNcacimiento,formatter);


                System.out.println("Nombre");
                String nombre= intr.nextLine();


                System.out.println("Fecha contratación: ");
                String fechaContratacion= intr.nextLine();
                DateTimeFormatter formatter1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaCon=LocalDate.parse(fechaContratacion,formatter);

                //Primera posicion vacia
                MetodoEmpleado.guardarEmpleado(new Empleados(DNI,fechaNac,nombre,fechaCon),Plantilla1);

                //Mostrar empleados actuales
                System.out.println("Empleados actualmente en plantilla: ");
                for(Plantilla e : Plantilla1) {
                    if(e!=null) {
                        System.out.println(e);
                    }
                }
                break;

            case 2:
                Scanner intr1=new Scanner(System.in);
                System.out.println("Introduzca datos empleado");
                System.out.println("DNI: ");
                String DNI1=intr1.nextLine();

                System.out.println("Introduce la fecha de nacimiento: dd/mm/yyyy");
                String fechaNcacimiento1=intr1.nextLine();

                //Pasar String Fecha nacimiento a localdate

                DateTimeFormatter formatter3= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaNac1=LocalDate.parse(fechaNcacimiento1,formatter3);


                System.out.println("Nombre");
                String nombre1= intr1.nextLine();


                System.out.println("Fecha contratación: ");
                String fechaContratacion1= intr1.nextLine();
                DateTimeFormatter formatter4= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaCon1=LocalDate.parse(fechaContratacion1,formatter4);

                System.out.println("Intro numero de telefono: ");
                String telefono=intr1.nextLine();

                //Primera posicion vacia
                MetodoEmpleado.guardarEmpleado(new Directivos(DNI1,fechaNac1,nombre1,fechaCon1,telefono),Plantilla1);

                //Mostrar empleados actuales{}
                System.out.println("Empleados actualmente en plantilla: ");
                for(Plantilla e : Plantilla1) {
                    if(e!=null) {
                        System.out.println(e);
                    }
                }
                break;

            case 3:
                Scanner intr2=new Scanner(System.in);
                System.out.println("Introduzca datos empleado");
                System.out.println("DNI: ");
                String DNI2=intr2.nextLine();

                System.out.println("Introduce la fecha de nacimiento: dd/mm/yyyy");
                String fechaNcacimiento2=intr2.nextLine();

                //Pasar String Fecha nacimiento a localdate

                DateTimeFormatter formatter5= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaNac2=LocalDate.parse(fechaNcacimiento2,formatter5);


                System.out.println("Nombre");
                String nombre2= intr2.nextLine();


                System.out.println("Fecha contratación: ");
                String fechaContratacion2= intr2.nextLine();
                DateTimeFormatter formatter6= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaCon2=LocalDate.parse(fechaContratacion2,formatter6);

                System.out.println("Intro codigo");
                String codigo=intr2.nextLine();

                MetodoEmpleado.guardarEmpleado(new Administrativo(DNI2,fechaNac2,nombre2,fechaCon2,codigo),Plantilla1);

                //Mostrar empleados
                System.out.println("Empleados en plantilla");
                for(Plantilla e:Plantilla1){
                    if(e!=null){
                        System.out.println(e);
                    }
                }
                break;
            case 5:
                salir=true;
                break;
        }
        }while (!salir);


















    }
}
