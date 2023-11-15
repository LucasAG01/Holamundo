public class Concesionario {

    private Coche coches[];
    private String nombre;

    //Constructores
    //Cuando una clase contiene una matriz, a esa matriz hayq ue darle un tamaño{}  fori para bucles rapido

    public Concesionario() {
        coches = new Coche[10];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Concesionario(String nombre, int capacidad) {
        this.nombre = nombre;
        coches = new Coche[capacidad];
    }

    //Método que si recibe un guarda el cohe me da true y si no puede false.

    public boolean addCoche(Coche c) {
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] == null) {
                coches[i] = c;
                return true;
            }
        }
        return false;
    }

    //Método que me busque el coche por la matrícula.

    public Coche getCocheByMatricula(String matricula) {
        for (Coche c : coches) { //por cada coche c en matriz coches
            if (c != null) {
                if (c.getMatricula().equals(matricula)) {
                    return c;
                }
            } else {
                break;
            }
        }
        return null;
    }

    //Método que elimina un cohe de la matriz por matrícula

    public boolean deleteCoche(String matricula) {
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                if (coches[i].getMatricula().equals(matricula)) {
                    coches[i] = null;
                    //Ordena la matriz para pasar todas las posiciones vacías al final
                    reordenarMatriz();
                    return true;
                }
            }
        }
        return false;
    }


    //Metodo contar coches

    public int contarCoches(){
        int contador=0;
        for(Coche coche:coches){
            if(coche!=null){
                contador++;
            }
        }
        return contador;
    }


    private void reordenarMatriz() {
        Coche copia[] = new Coche[coches.length];

        int contador = 0;
        for (int i = 0; i <coches.length ; i++) {
            if (coches[i]!=null) {
                copia[contador]=coches[i];
                contador++;
            }

        }
        coches=copia;

    }


    //
    @Override
    public String toString(){
        String info="Concesionario "+nombre+"\n";

        for(Coche coche: coches){
            if(coche!=null){
                info+= coche.toString();
                info+="\n";
            }
            else{
                break;
            }
        }
        return info;
    }




















































}
