public class Televisor extends Producto1 {

    //Clase Televisor que define los atributos exclusivos de un televisor

    private int pulgadas;
    private int frecuencia;

    public Televisor() {
        super();
    }

    public Televisor(String codigo,String marca,String modelo,double precio,int pulgadas,int frecuencia){
        super(codigo,marca,modelo,precio);
        this.frecuencia=frecuencia;
        this.pulgadas=pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return super.toString() +  //añadi el super(Producto1)
                " pulgadas=" + pulgadas +
                ", frecuencia=" + frecuencia +
                '}';
    }

    @Override //Modifico el metodo en específico para mis datos específicos.
    public void aplicarDescuento(){
        super.aplicarDescuento(); //Llmada al super
        if(this.pulgadas>60){   //Si las pulgadas son mayores a 60
            setPrecio(getPrecio()*0.90);   //10% descuento Escritura(Lecturaprecioactual()*descuento)
        }
    }
















}

