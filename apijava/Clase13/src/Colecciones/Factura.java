package Colecciones;

import java.util.Objects;

public class Factura implements Comparable<Factura> {

    private String id;
    private float precio;

    public Factura(String id, float precio) {
        this.id = id;
        this.precio = precio;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return '{' +
                "id='" + id + '\'' +
                ", precio=" + precio +
                '}';
    }



    //Añadir criterio de igualdad.  hay que modificar 2 metodos ---->Equals, HashCode
    //ESTO ES EN LA CLASE FACTURAS

    //Estos overrides has y equ, lo que hacen, es cambiar lo que se condisera "iguales" en un conjunto de datos,
    //Yo quise que si en las facturas tienen el mismo id, significa que son iguales, el precio da igual, porque
    //lo puse así a la hora de generarlo.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factura factura)) return false;
        return Objects.equals(id, factura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }




    //Tras haber creado un CRITERIO DE IGUALDAD ARRIBA, ahora quiero ordenar mis facturas, por lo que tengo ahora que crear
    //AQUÍ DEBAJO, UN CRITERIO DE ORDENACIÓN en este caso por precio
    //Lo que se hará es, incrementar arriba comparable


    @Override
    public int compareTo(Factura o){
        return Float.valueOf(precio).compareTo(o.precio);
    }















}
