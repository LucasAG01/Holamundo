public class Avion extends Vehiculo {

    private float alturaDeVuelo;

    //Cuando extend y añadimos un atributo, decimos que Avion es como un vehículo

    public Avion(String codigo, float velocidad, float alturaDeVuelo) {
        super(codigo, velocidad);
        this.alturaDeVuelo = alturaDeVuelo;
    }

    public float getAlturaDeVuelo() {
        return alturaDeVuelo;
    }

    public void setAlturaDeVuelo(float alturaDeVuelo) { //Recibe cantidad y actualiza
        this.alturaDeVuelo = alturaDeVuelo;
    }

    @Override
    public String toString() {
        return "Avión :"+ super.toString() +" "+
                "alturaDeVuelo=" + alturaDeVuelo;
    }


    //Un avion multiplica por 10 el parámetro recibido en el método acelerar
    @Override
    public void acelerar(int parametro) {
        super.setVelocidad(super.getVelocidad()+ parametro*10);
    }

    public void modificarAlturaDeVuelo(int metros) {
        this.alturaDeVuelo+=metros;
    }

}
