public class Coche extends vehiculo {
    //{}
    private float nivelAceite;

    public Coche(String codigo,float velocidad,float nivelAceite){
    }

    public float getNivelAceite() {
        return nivelAceite;
    }

    public void setNivelAceite(float nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nivelAceite=" + nivelAceite;
    }
}
