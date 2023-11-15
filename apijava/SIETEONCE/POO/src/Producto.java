public class Producto {

   private String codigo;
   private String marca;
   private String modelo;
   private double precio;
   public static String tienda;  //Línea 111 siemrpe que declaramos atributo, hay que hacerlo arriba.(orden) Es pública y podemos acceder directamente, Tods productos son de la tienda ahora.

    public Producto() {
        //Esto de aquí lo he creado al final, mejor al rpincipio cuando pongo lo de
        //declarar las avriables.
    }

    //Para crear obejtos necesitamos usar el operador new, este operador
    //Llama a un método especial que está presente en todas las clases
    //aunque no se lo añadamo -→ Constructor

    //Los constructores NO TIENEN RETORNO Y DEBEN LLAMARSE IGUAL QUE LA CLASE

   //Normalmente por cada atributo privado de un objeto, se añaden 2 métodos de acceso,
    // uno de lectura(getter) y otro de escritura (setter).


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {  //Set recibe String, comprueba la estructura correcta ylo guarda en el codigo de clase.
        //Comprobamos que es correcto       //Si no se cumple no lo actualiza
        if(codigo.length()==5){
            this.codigo = codigo;
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

    //String to String{}  Tambien se puede dar generar toString
@Override
    public String toString(){
        return "Código= "+codigo+", marca= "+marca+", modelo= "+modelo+", precio= "+precio+"€";
    }

    //
//***************

    //Constructores

    //Puede ser sobrecargado para tener más opciones a la hora de crear los objetos.
    //Vamos a añadir un constructor que reciba todos los valores de un producto y
    //cree un objeto inicializandolo a esos valores.

    public Producto(String codigo,String marca,String modelo,double precio){
        setCodigo(codigo);
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        Producto.tienda="Alcampo"; //Línea 111, La tienda no cambia.
    }

        //Para establecer el código hemos llamado a setCodigo para asegurarnos de que se guarda correctamente,
        //Si no lo hago el código podria tener cualquier formato.(codigo.legth()==5)
        //sino pondria this.codigo y ya.
    //Página MAIN...

//*****************

    //Otros métodos

       //Por ejemplo podemos añadir un aplicar descuentos.
       //En este caso será que rebaje un 10% si el producto supera los 1000 euros
       //Y en un 5% si no lo es.

    public void aplicarDescuento(){
        //Primero comprobamos que el precio está establecido
        if(precio>0){
            if(this.precio<=1000){ //Si el precio es menor a 1000
                precio*=0.95;  //Descuento del 5%
            }
            else {
                precio*=0.9;  //Si no es menor a mil será mayor así que si no secumple lo de arriba aplicara el 10% de descuento
            }
        }//Esto es lo que comprueba que haya un precio, el else va dentro del if(precio<==1000)

    }
            //Ejecucion en MAIN


//*******************

    //Ámbito static: Variables de isntancia vs Variables de clase

        //En ciertos casos nos interesa tener información a nivel de clase, es decir, que se ala misma para todos los
        //objetos, esta infromacion se guradara en tipo static (variables de clase).

        //Al crear la variable static se prodrá acceder a ella incluso sin tener objrtos creados de la clase y ninguna
        //referencia.

    //Vamos a suponer que todos nuestros productos deben pertenecer siemrpe a la misma tienda, por lo tanto,
    //añadiremos un atributo de tipo String que se llamrá "tienda", tambien modificaremos constructores para que se
    //actualice este dato.


//*********************

    //Métodos de tipo static:

       //Si el atributo tienda fuese privado, necesitaríamos unos métodos de acceso para leeer o escribir en él.
       //Estos métodos deben ser estaticos también.

        public static String getTienda(){
        return tienda;
        }

        public static void setTienda(String tienda){
        Producto.tienda=tienda;
        }

        //Como dentro de un método estático no podemos utilizar this en el método setTienda donde hay conflicto de nombres,
        //diferenciamos el atributo de la clase poniendo primero el nombre de la clase: Producto.tienda

        //Para ejecutar los métodos anteriores solo necesitamos una referencia de tipo Producto; (Main)

        // Los metodos static solo pueden aparecer por sotros statics, solo datos static no puedes usar this.





}

