public abstract class Vehiculo implements Acelerable,Comparable<Vehiculo> {
                                                         //Como la clase es abstracta no da error

    private String codigo;
    private float velocidad;

    public Vehiculo(String codigo, float velocidad) {
        this.codigo = codigo;
        this.velocidad = velocidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return
                "codigo='" + codigo + '\'' +
                ", velocidad=" + velocidad+" ,";
    }

    //Ahora queremos aumentar la velocidad de los vehiculos, pero cada uno lo hará de diferente manera.{}

   // public abstract void acelerar(float parametro);   //enotnces una clase abstracta se crea para hacer común a varias subclases
  //Quite esto()l65 test vehiculos                                                    //definir una interfaz común y, posiblemente, para proporcionar una implementación
                                                      //parcial o completa de ciertos métodos que son compartidos por varias subclases.

    //Todos los vehiculos tienen la capacidad de aumentar su velocidad
    //pero cada vehiculo lo hará de diferente manera

    //Definir criterio de ordenación para Vehiculos

    @Override
    public int compareTo(Vehiculo v){
      //  return this.codigo.compareTo(v.getCodigo());
        //Por velocidad
        Float veloc=Float.valueOf(velocidad);
        return veloc.compareTo(v.getVelocidad());//*-1; al lado del último parentesis para ordenar de mayor a menor velocidad
    }




}
