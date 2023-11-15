import java.time.LocalDate;

public class coche {

    //De cada coche:
    //Matricula,Fecha fabric,Marca,Modelo,Precio,motor

    private String matricula;
    private LocalDate fechaFabricacion;  //Fechas
    private String marca;
    private String modelo;
    private float precio;
    //Private Motor motor;    Composición.


    //Constructores clase coche

    public coche() {
    }

    public coche(String matricula, LocalDate fechaFabricacion, String marca, String modelo, float precio) {
        this.matricula = matricula;
        this.fechaFabricacion = fechaFabricacion;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    //Si quiero que el cohe solo salga matricyla y modeolo, tengo que crear otro constructor

    public coche(String matricula,LocalDate fechaFabricacion) {
        this.matricula = matricula;
        this.fechaFabricacion=fechaFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }



}
