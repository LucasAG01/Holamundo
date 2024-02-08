public class Main {
    public static void main(String[] args) {

        Ordenador o=new Ordenador(); //He creado un ordenador

        //Un ordenador es un prducto por lo que puedo crear ordenadores referenciados como Producto.(Polimorfismo)
        Producto1 p=new Ordenador();

        //El poliformismo renta si voy a trabajar con muchos productos y los voy a agrupar en una matriz
        Producto1 ps[]=new Producto1[9];

        //Televisor

        Ordenador o1=new Ordenador("AJ789","HP","Omen",2000,1000,"Windows 10","16");

        Producto1 ds=new Televisor("PS345","Hisense","kys",1200,55,60);

        //aplicar descuento.
        ds.aplicarDescuento();
        System.out.println("El precio rebajado es: "+ds.getPrecio()+" €"); //Como lo modifique pongo el de lectura.


        System.out.println(ds);


        //Poliformismo y enlazado dinamico.

        Ordenador o3=new Ordenador();
        Televisor t1=new Televisor();
        //-----
        Producto1 p1=new Ordenador();
        Producto1 p2=new Televisor();
        Producto1 q;

        //Una referencia de tipo de una superclase podrá apuntar a cualuqier objeto cuyo tipo sea de una subclase suya,
        //solo podrá encontrar aquellas propiedades y métodos que fueron definidos en la clase base.
        q=o3;
        q=t1;

        //Un Ordenador y un Televisor son productos.
        //Usamos poliformismo para más flexibilidad, ejemplo, modificar método aplicarDescuanto. (Overrides)

        Producto1 tele1=new
                Televisor("WR456","Lg","UHD34567",900,65,1000);
        Producto1 ordenador1=new
                Ordenador("PT6784","Asus","Zenbook",850,1500,"Linux","8");

        tele1.aplicarDescuento();//MODIFICADOR
        ordenador1.aplicarDescuento(); //MODIFICADOR

        System.out.println("Precio con rebajas: ");
        System.out.println("Tele 1: "+tele1.getPrecio()); //Como lo modifique pongo el de lectura.
        System.out.println("Ordenador 1 "+ordenador1.getPrecio()); //Como lo modifique pongo el de lectura.


        //Se está ejecutando correctamente el método aplicar descuento, correctamente gracias a la modificación.
        //No se puede reducir la visibilidad de un método , es decir el atributo de acceso no puede ser más restrictivo que el método original.
        //No se puede modificar la firma del método , ya que sino tendríamos dos métodos diferentes.



        //Casting de objetos.

        //Supongamos que tenemos ordenador1 y queremos cambiarle la ram, al acceder a los métodos setRam o setAlmacenamiento
        //vemos que no somos capaces y que solo podemos ejecutar los métodos definidos en la clase Producto.

        //Para solucionar esto deberemos convertir el tipo de la referencia de Producto a Ordenadsor ***(downcasting)***
        //Se realiza precediendo a la variable del nombre de la subclase entre paréntesis.

        //Esta expresión devuelve una referencia de tipo Ordenador que apunta a ordenador1 .
        // Esta referencia podemos guardarla en otra referencia o envolverla entre paréntesis
        // para poder ejecutar directamente métodos de la clase Ordenador:

        ((Ordenador)ordenador1).setAlmacenamiento(2000);
        Ordenador y=(Ordenador)ordenador1;
        y.setAlmacenamiento(2000);


        //El downcasting en este caso puede hacerse porque la referencia ordenador1 apuntaba a un objeto ordenador,
        // pero hay que tener cuidado, ya que podemos cometer ciertos errores, por ejemplo:

        Televisor t = (Televisor)ordenador1;

        //La línea anterior nos va a producir un error en tiempo de ejecución,
        //ya que no podemos convertir un Ordenador en un Televisor, esto es, un Ordenador no es un Televisor.


        //***(upcasting)*** es la conversión de una referencia de la subclase a una referencia de la super clase y esta operación a diferencia del downcasting es siempre segura
        // Ya que una subclase siempre será del tipo de la superclase. Un ordenador es un Producto y un Televisor es un Producto.

        Ordenador a2 = new Ordenador();
        Televisor a3 = new Televisor();
        Producto1 a4 = new Ordenador();
        Producto1 a5 = new Televisor();
        Producto1 l;
        l = o3;  //upcasting implícito
        l = (Producto1)t1;  //upcasting explícito (no es necesario)


            //APLICACION

        //Necesitamos almacenar nustros productos, necesitamos una matriz.
        //Si queremos guardar TVs u PCs debemos crear matriz Producto

        Producto1 productos[]=new Producto1[10];
        //fuardamos algunos productos
        productos[0]=new Ordenador("AQ123","Lenovo","Ideapad 200",550,128,"Windows 10","4");
        productos[1] = new Televisor("AW100","Panasonic","Ni idea",750,80,500);

        //Recibe un producto y lo almacena en la primera posicion vacia, Podemos añadir este método en la clase Principal
        // antes o después del main o podemos añadírselo a la clase producto.
        //Podemos añadir este método al principio (debajo del public class main) o crear el método en la calse Producto.

        Producto1.guardarProducto(productos,new Televisor("QE442","Samsung","A saber",400,40,100));
        Producto1.guardarProducto(productos,new Ordenador("LT3343","Asus","Yoga 3000",900,1000,"Windows 10","8"));

        //Descuanto todos los productos  28/11   pag 14

        for(Producto1 v : productos) {
            if(v!=null) {
                v.aplicarDescuento();
            }
        }
        //Al tener el metodo en alñ clase base,no importa si hay ordenadores o televisores.

        //PERO si queremos modificar el precio de televisoires de la marca panasonic aumentando 50 euros, debemos convertir la
        //variable que utiliza el for each al tipo Televisor ya que de lo contrario no poderemos ocnsultar la marca que contiene.
        //hay que hacer esto

       /* for(Producto1 v : productos) {
            if(((Televisor)v).getMarca()=="Panasonic") {
                v.setPrecio(v.getPrecio()+50);
            }
        }*/

        //Ahora habra un error en caso de que en la matriz haya Ordenadores ya que no podra recorrer.

        //Para esto usamos el operador instanceof.
            //Tendriamos que preguntar que tipo de objeto se guarda en la matriz antes de realizar el cast,
            //instanceof nos devuelve el tipo al que pertenece una referencia.

        for(Producto1 v : productos) {
            if(v instanceof Televisor) {
                if(((Televisor)v).getMarca()=="Panasonic") {
                    p.setPrecio(p.getPrecio()+50);
                }
            }
        }
        //Ahora, Primero se comprueba a que tipo de objeto está apuntando v y en caso de que sea un Televisor, se realiza la operación.

        










    }
}