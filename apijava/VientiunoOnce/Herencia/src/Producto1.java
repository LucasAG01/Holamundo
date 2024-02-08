public class Producto1 {

    //Contiene los atributos que van a ser comunes a todos los "tiposd e productos" que vamos a manejar en nustar aplicación
    //También, contiene una serie de métodos que van a necesitar tods los objetos productos.
    //Los productos con los que vamos a trabajar son TELEVISORES y ORDENADORES.

    private String codigo;
    private String marca;
    private String modelo;
    private double precio;
    private static String tienda;

    public Producto1() {  //Constructor default
    }

    //Constructor que permite establecer los atributos


    public Producto1(String codigo, String marca, String modelo, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Métodos de acceso (get set){}

        //lectura codigo
    public String getCodigo() {
        return codigo;
    }
        //escritura codigo
    public void setCodigo(String codigo) {
        if(codigo.length()==5){
            this.codigo=codigo;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static String getTienda() {
        return tienda;
    }

    public static void setTienda(String tienda) {
        Producto1.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Producto1{" +
                "codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio;
    }

    //Método aplicar descuento.

    public void aplicarDescuento(){
        if (precio!=0){
            if(this.precio>0 && this.precio <=1000){ //Si es mayor que 0 y mnor que 1000
                precio*=0.95; //5%
            }else { //si no es menor a 1000
                precio*=0.9; //10%
            }
        }
    }

    //Método para guardar productos en uan matriz
    public static boolean guardarProducto(Producto1 []ps,Producto1 p) {
        boolean guardado = false;
        for(int i = 0;i<ps.length;i++) {
            if(ps[i]==null) {
                ps[i] = p;
                guardado = true;
                break;
            }
        }
        return guardado;
    }





}
