public class Main {
    public static void main(String[] args) {

        //Declarar variables tipo Producto

        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        //Hemos declarado 3 variables de tipo producto, pero no tenemos ningun obejto
        //solo referencias que pueden manipular, apuntar a un objeto tipo Producto

        p1.setCodigo("Ar320"); //Si intentaramos guardar código mal, saldria un null por pantalla.
        p1.setMarca("Samsung");
        p1.setModelo("J7-2018");
        p1.setPrecio(220);

        System.out.println("Código: "+p1.getCodigo());
        System.out.println("Marca: "+p1.getMarca());
        System.out.println("Modelo: "+p1.getModelo());
        System.out.println("Precio: "+p1.getPrecio());

        System.out.println("**********************************************");

        //Pero si una clase tiene 20 atributos, no puedo pasarle un sout(p1) y pista...
        //Sí, pero hay que heredar un método toString que vamos a modificar para que la
        //sintaxis sea como deseamos. en la clase Producto lo creamos.

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("**********************************************");

        //Método Hashcode. Tema9

        //por cada obejto creado se genera un código que es la direccion de memoria
        //Es importante por ejemplo para (matrices de objetos dinámicas) para crear objetos y realizar
        //búsquedas eficientes

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println("**********************************************");

        //Método equals

        //Devuelve true si dos obejtos son iguales y false si no.

        System.out.println(p1.equals(p2)); //-->false
        p2=p1;
        System.out.println(p1.equals(p2)); //-->true

        System.out.println("**********************************************");


        //Tras lo creado en el apartado contructores, ahora puedo crear
        //Objetos en este coonstructor

        //Esto en verdad es Lo 1 que deberia hacer al declarar los atributos porque ahora
        //Puedo hacer esto al principio, en resumen, esto de aquí va arriba donde lo que está con //

        Producto p4=new Producto("12345","HP","Omen 2000",1980);

        p4.aplicarDescuento();
        //System.out.println(p4+" "+Producto.tienda); //Línea 111(tienda)
        Producto.setTienda("Almacenes Gastón");
        System.out.println(p4+" "+Producto.getTienda()); //liena ultima?¿










































































    }
}