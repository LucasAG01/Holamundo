package utils;

public class Proceso {

    private String codigo;
    private String descripcion;
    private long duracion;
        //Añadimos contructor los settery getter
    public Proceso(String codigo, String descripcion, long duracion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

    //To Stering


    @Override
    public String toString() {
        return codigo + '_' +
                  descripcion + '_' +
                  duracion;
    }
}
