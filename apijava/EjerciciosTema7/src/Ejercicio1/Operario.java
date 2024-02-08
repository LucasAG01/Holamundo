package Ejercicio1;

import java.time.LocalDate;

public class Operario extends Empleados{

    private String seguroAccidente;
    private String seguroCivil;

    public Operario(String dni, LocalDate fechaNacimiento, String nombre, LocalDate fechaContratacion, double salario, String seguroAccidente, String seguroCivil) {
        super(dni, fechaNacimiento, nombre, fechaContratacion);
        this.seguroAccidente = seguroAccidente;
        this.seguroCivil = seguroCivil;
    }

    public String getSeguroAccidente() {
        return seguroAccidente;
    }

    public void setSeguroAccidente(String seguroAccidente) {
        this.seguroAccidente = seguroAccidente;
    }

    public String getSeguroCivil() {
        return seguroCivil;
    }

    public void setSeguroCivil(String seguroCivil) {
        this.seguroCivil = seguroCivil;
    }

    @Override
    public void calcularSalario(){
        int antiguedad=super.calculAranhosAntiguedad();
        super.salario=Empleados.salarioBase+((double) antiguedad /3)*salarioBase*0.05f;
    }

    @Override
    public String toString() {
        return super.toString()+
                "seguroAccidente='" + seguroAccidente + '\'' +
                ", seguroCivil='" + seguroCivil + '\'';
    }
}
