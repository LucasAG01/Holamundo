public enum Motor {
    ;

    //De cada motor interesa almacenar
        //litris aceite
        //Potencia en caballos KW o 1kw=1.34 caballos
        //tipo de motor -> gasolina,diese,electrico,hibrido

    private int litrosaceite;
    private float potencia;                  //NOTA : CREAR VARIABLE USAR OPERADOR NEW {}
    private tipoMotor tipoMotor;

    Motor() {
    }
    Motor(int litrosaceite, float potencia, tipoMotor tipoMotor) {
        this.litrosaceite = litrosaceite;
        this.potencia = potencia;
        this.tipoMotor = tipoMotor;
    }
}
