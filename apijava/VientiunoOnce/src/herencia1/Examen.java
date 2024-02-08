package herencia1;

import java.time.LocalDate;

public class Examen {

    //Aqui posteo lo que va a ser común a todos los examenes, como la fecha,

    private LocalDate fecharealizacion;

    public Examen(LocalDate fecharealizacion) {
        super();
        this.fecharealizacion = fecharealizacion;
    }

    public LocalDate getFecharealizacion() {
        return fecharealizacion;
    }

    public void setFecharealizacion(LocalDate fecharealizacion) {
        this.fecharealizacion = fecharealizacion;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "fecharealizacion=" + fecharealizacion +
                '}';
    }

}
