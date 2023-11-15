public class jugador {

    private String Codigo;
    private String Nombre;
    private int Puntos;
    private static final String COMPETICION = "Liga Española";
    //{}


    public jugador(String codigo, String nombre) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Puntos = 0;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.length() == 2 && Character.isLetter(codigo.charAt(0)) && Character.isDigit(codigo.charAt(1))) {
            this.Codigo = codigo;
        } else {
            throw new IllegalArgumentException("El código debe tener una letra y un dígito");
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int puntos) {
        Puntos = puntos;
    }


    public void actualizarPuntos(int puntos){  //Añadir método actualizarPuntos(int puntos) : Recibe una cantidad de puntos que es sumada a los puntos almacenados.
        this.Puntos+=puntos;
    }


@Override
    public String toString(){return "Código= "+Codigo+" Nombre= "+Nombre+" Puntos= "+Puntos+" Competición= "+COMPETICION; }

}
