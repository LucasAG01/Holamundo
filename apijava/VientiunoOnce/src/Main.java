import herencia1.Examen;
import herencia1.ExamenEscrito;
import herencia1.ExamenOral;
import herencia1.NivelSatisfaccion;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExamenEscrito programacion=new ExamenEscrito(LocalDate.of(2022,3,3),4,120);


        System.out.println("Info del Examen programacion: ");
        System.out.println(programacion);

        ExamenOral ingles=new ExamenOral(LocalDate.of(2023,12,21), NivelSatisfaccion.Bueno);
        //Rehacer oral.


        Examen indefinido=new Examen(LocalDate.of(2012,3,23));

        Examen examen,examen2; //Decision que toma el usuario imenmtras usa la app, tengo quew decir que necesito espacio para el examen.

        examen=new ExamenEscrito(LocalDate.of(2012,2,23),8,80);
        //Esta variable de ripo examen esta apuntando a uno escrito
        examen=new ExamenOral(LocalDate.of(2023,6,4),NivelSatisfaccion.Insuficiente);

        System.out.println(examen);














































    }
}