public class Leopardo extends Animal implements Acelerable,Comparable<Leopardo>{

    //leorpardo sera el unico aniaml que quiero que acelere,por lo uqe pongo implenmts acelerar

    private int velocidad;
    public Leopardo(String nombre) {
        super(nombre);
    }

    @Override //Al poner el implements consegui el metodo acelerar
    public void acelerar(int parametro) {
        this.velocidad+=parametro*3; //Puse que el parametro se multuplique *3 y se le sume a la velocidad base.
    }


    //Al no ser abstracta me puso esto al poner compareto
    @Override
    public int compareTo(Leopardo o) {
        return 0;
    }
}
