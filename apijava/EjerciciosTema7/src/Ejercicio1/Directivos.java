package Ejercicio1;

import java.time.LocalDate;

public class Directivos extends Empleados {

    private String telefono;


    public Directivos(String dni, LocalDate fechaNacimiento, String nombre, LocalDate fechaContratacion, String telefono) {
        super(dni, fechaNacimiento, nombre, fechaContratacion);
        this.telefono = telefono;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //salario{ } de los deirectivos
    @Override
    public void calcularSalario(){
        int antiguedad=super.calculAranhosAntiguedad();
        super.salario=Empleados.salarioBase+((double) antiguedad /3)*salarioBase*0.2f;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "telefono=" + telefono;
    }

}
