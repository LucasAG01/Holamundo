package Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Empleados extends Plantilla {

    private String dni;
    private LocalDate fechaNacimiento;
    private String nombre;
    private LocalDate fechaContratacion;
    double salario;
    protected static float salarioBase=1000;

    public Empleados(String dni, LocalDate fechaNacimiento, String nombre, LocalDate fechaContratacion) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        Empleados.salarioBase = salarioBase;
    }


//MÉTODOS PARA LOS EMPLEADOS.

    //Añs antiguedad{}
    protected int calculAranhosAntiguedad(){
        Period periodo=Period.between(fechaContratacion,LocalDate.now()); //Period realizar operaciones y calculos.
        return periodo.getYears();
    }

    //Calcular salario
    public void calcularSalario(){
        //Años antiguedad
        int antiguedad=calculAranhosAntiguedad();
        salario=salarioBase+((double) antiguedad /3)*salarioBase*0.05f;
    }


    @Override
    public String toString() {
        return "Ejercicio1.Empleados{" +
                "dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nombre='" + nombre + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario;
    }


}
