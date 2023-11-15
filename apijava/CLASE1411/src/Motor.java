public class Motor {
    //De cada motor me ineteresa alamcenar:
        //Litros de aceite
        //Potencia en caballos o Kw o KW=1.34 caballos.
        //tipo de motor -> Gasolina, Diesel, Eléctrico, Híbrido. //Clase enum TipoMotor

    private int litrosAceite;
    private float potencia;
    private TipoMotor tipoMotor;   //Estos son los atributos del motor de los coches  {}

//PREGUNTA EXÁMEN: ¿Cuántos constructores tengo en esta clase? -→ tiene un constructor, el constructor de la clase Motor.
// Este constructor no tiene parámetros, pero sí hace algo: inicializa los atributos del motor con los valores predeterminados.

    public Motor() {  //Le di click genrar contructor y opcion motor, asi genero un contrucot default.
    }                 //Constructor -→ Métodos que permiten inicializar atributos de objetos. llamr constructores-->main 1*
                        //Me interesa tener también creado el default por si no tengo datos.
    public Motor(int litrosAceite, float potencia, TipoMotor tipoMotor) { //Cosntructor
        this.litrosAceite = litrosAceite;
        this.potencia = potencia;
        this.tipoMotor = tipoMotor;
    }

//Resumen, 1 tengo la clase, 2 defino atributos, 3 defino constructores.


    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public float getPotencia() { //Esto solo lee
        return potencia;
    }

    public void setPotencia(float potencia) { //Aquí es donde se procesan las cosas (potencia no debe superar tal.)
        this.potencia = potencia;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    //El .toString no me interesa como está, así que lo debo sobreescribir.
    @Override
    public String toString() {
        return "Motor m2: " +
                "litrosAceite=" + litrosAceite +
                ", potencia=" + potencia +
                ", tipoMotor=" + tipoMotor ;
    }

    public void cambiarMotor(int litrosAceite, float potencia, TipoMotor tipoMotor) {
        this.litrosAceite = litrosAceite;
        this.potencia = potencia;
        this.tipoMotor = tipoMotor;
    }



}








