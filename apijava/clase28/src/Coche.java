public abstract class Coche extends Vehiculo {

    private float nivelAceite;

    public Coche(String codigo, float velocidad, float nivelAceite) {  //Genrate constructor
        super(codigo, velocidad);//Llamada al construcor 1linea
        this.nivelAceite = nivelAceite;
    }

    public float getNivelAceite() {
        return nivelAceite;
    }

    public void setNivelAceite(float nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    @Override
    public String toString() {
        return  super.toString()+" nivelAceite="+nivelAceite;
    }

    //Todavía no sabemos programar el método acelerar. Tras convertir vehiculo en abstr toca hacer esta tmabien y en extends que no sepapos.








}
