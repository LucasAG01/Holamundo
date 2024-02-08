package herencia1;

import java.time.LocalDate;

public class ExamenOral extends Examen {

    private NivelSatisfaccion ns;

    public ExamenOral(LocalDate fecharealizacion, NivelSatisfaccion bueno) {
        super(fecharealizacion);
        this.ns=ns;
    }

    public NivelSatisfaccion getNs() {
        return ns;
    }

    public void setNs(NivelSatisfaccion ns) {
        this.ns = ns;
    }

   //problemas al lanza<r oral,

    public boolean aprobar(){
        /*if(ns==NivelSatisfaccion.Suficiente||ns==NivelSatisfaccion.Bueno){
            return true;
        }
        return false;*/
        return ns==NivelSatisfaccion.Suficiente || ns==NivelSatisfaccion.Bueno;
    }

    
}
