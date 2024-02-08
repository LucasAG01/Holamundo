package Ejercicio1;

import java.time.LocalDate;

public class Administrativo extends Empleados {

    private String codigo;

    public Administrativo(String dni, LocalDate fechaNacimiento, String nombre, LocalDate fechaContratacion, String codigo) {
        super(dni, fechaNacimiento, nombre, fechaContratacion);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(validarCodigo(codigo)){
            this.codigo=codigo;
        }else {
            System.out.println("Error, no es buen formato");
        }
    }

    private boolean validarCodigo(String codigo){
        return codigo.matches("\\d\\D.*");
    }

    @Override
    public void calcularSalario(){
        //Años antiguedad
        int antiguedad=calculAranhosAntiguedad();
        salario=salarioBase+((double) antiguedad /3)*salarioBase*0.09f;
    }

    @Override
    public String toString() {
        return super.toString() +
                "codigo='" + codigo + '\'';
    }
}
