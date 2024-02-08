package herencia1;

import java.time.LocalDate;

public class ExamenEscrito extends Examen{

    public ExamenEscrito(LocalDate fecharealizacion) { //Este super es una llamda a la clase paddre (examen){}
        super(fecharealizacion);
    }
    //Aquei tengfo que aádir lo que es pripio de un examen escrito.

    private int nota;
    private int tiempoEjecucion;

    //Examen: cuantos 3 nota, fecha, ejecucion

    public ExamenEscrito(LocalDate fechaRealizacion,int nota,int tiempoEjecucion){
        super(fechaRealizacion);
        this.nota=nota;
        this.tiempoEjecucion=tiempoEjecucion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }



    @Override
    public String toString() {
        return "ExamenEscrito{Fecharealizacion "+super.getFecharealizacion() +
                " nota=" + nota +
                ", tiempoEjecucion=" + tiempoEjecucion +
                '}';
    }



}
