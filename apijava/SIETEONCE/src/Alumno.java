public class Alumno {
//Acabo de definir/crear la variable ALUMNO,

    //Atributos:nombre,edad,DNI
    private String nombre;  //x cada metododo private, se crean dos clases 1 para leer y otro para modificar de manera correcta.
    private int edad;
    private String DNI;
    private String curso;
    private int notas[];


    //Metodos{}

    public boolean esMayorEdad(){
        if(edad>=18){
            return true;
        }
        return false;
    }

   //Constructores. si no añadimos ninguno se añade auto uno heredado de la clase object.Clases deben tener contructor se ejecutan cuando se crea objeto.
    public Alumno(){  //Se deben llamr igual que la clase se

                   //Un contructor hace esto x defecto. (String = null e int = 0) lo pueod modificar

    }

    public Alumno(String nombre,int edad,String dni) throws Exception {
        this.nombre=nombre;
        this.edad=edad;   //this es un puntero que apunta al obejto que se esta creando en ese momento.
        setDNI(DNI); //Llame al set que programé abajo.
    }


        //RESUMEN CREO MIS VARIABLES QUE PUEDEN CONTENER OTRAS VARIABLES, PUEDEN CONTENER METODOS QE ME DAN INFORMACION SOBRE EL ESTADO DEL OBJETO Y LOS ATRIBUTOS
        //QUE GUARDA EL OBJETO Y LUEGO QUE TENGO UNOS METODOS ESPECIALES LLAMADOS CONTRUCTORESS QUE PERMITEN INICIALIZAR METODOS QUE SON LLAMDOS CON THIS.


    //Además de estos metodos contructores y atributos, todas las clases tienen una serie de metodos heredados de la clase base de todas llamda Object.

   //Metodos heredados de la clase object
    //toString Cuando modifico metodo heredado se llama sobreescribir
    @Override //Opcional

    public String toString(){ //Hay que ponerlso bien toString. Al heredar hay que escribir bn.
        return this.nombre+ " "+this.edad+" "+this.DNI;
    }


    //Métodos de acceso get y set
    //Get me devulve el dato

    public String getDNI(){  //Me permite a accdere al valro DNI y ver lo que hay guardado
        return DNI;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }


    //Set

    public void setDNI(String DNI) throws Exception {
        //Un dni es correcto si tiene 9 caracteres
        if(DNI.length()==9){
            this.DNI=DNI;
        }
        else{
            throw new Exception("DNI Erróneo");
        }
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad){    //Las cosas procesadas son en el set
        if(edad>=16){
            this.edad=edad;
        }
    }
   //Las cosas de por ejemplo si está mal...(else) se hace en el apartado main

    //Alumno a1;
   // try {
        //a1=new Alumno("Pedro",23,"W");
   // }catch (Exception e){
       // System.out.println("DNI rana");
  //  }





























}
