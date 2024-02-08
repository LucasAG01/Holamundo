public class Ordenador extends Producto1 {

    //Primera subclase (de producto) va a tener las propiedades exclusivas de esta, en este caso de Ordedanor.
    //RAM, SO, Discoduro...

    private int almacenamiento;
    private String sistemaOperativo;
    private String ram;

    public Ordenador(){
        super(); //Esto es una llamada al constructor por defecto de Producto, En caso de que la calse producto no tuviera constructor
                 //Habria un error.
    }



        //Esto es un constructor para la clase ordenador que inicialice todos los atributos de un Ordenador.
            //La primera línea es una llamada a un constructor de la superclase.(construcot al que llamamos debe estar definido en superclase"Producto1").

    public Ordenador(String codigo,String marca,String modelo,double precio,int almacenamiento,String so,String ram){
        super(codigo, marca, modelo, precio);
        this.almacenamiento=almacenamiento;
        sistemaOperativo=so;
        this.ram=ram;
    }


    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    //En 3 propiedaes, pero tambien debe contener las propiedades comunes(producto) al ser llamado el Ordendaor


    @Override //esto indica al compilador que estamos sobreescribiendo un método es un sout.  //Ahora modifico el método para que salga tambien lo de producto al ahacer sout
    public String toString() {
        return super.toString()+
                " almacenamiento=" + almacenamiento +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
    //Hay que editar los overrides segun mejor em convenga, en este caso, lo programe para que antes de mostrarme las propiedades de un prdenador,
    //me mostrase las de su clase padre, Producto1,(super.toString()).


    //Ejemplo de poliformismo, donde modificamos el método con Override para aplicxar descuento a pcs si no son Windows.
    @Override
    public void aplicarDescuento(){
        super.aplicarDescuento(); //Llamada al super.
        if (!this.sistemaOperativo.contains("Windows")){ //Si NO contiene la palabra Windows
            setPrecio(getPrecio()*0.95);    //Aplicar 5% descuento. Escritura(Lecturaprecioactual()*descuento)
        }
    }
}
