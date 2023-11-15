public class Estadio {

    private String Nombre;
    private int Capacidad;
    private String Ciudad;

    public Estadio(String nombre,int capacidad,String ciudad){
        this.Nombre=nombre;
        this.Capacidad=0;
        this.Ciudad=ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }



}
