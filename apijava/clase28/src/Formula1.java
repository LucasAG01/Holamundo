public class Formula1 extends Coche {

    //Cuando una calsw hereda de otra, t no añadimos nada: Formula1 ES un Coche

    public Formula1(String codigo, float velocidad, float nivelAceite) {
        super(codigo, velocidad, nivelAceite);
    }

    @Override
    public void acelerar(int parametro) {
        // TODO Auto-generated method stub
        super.setVelocidad(super.getVelocidad()+parametro*5);
    }

    @Override
    public String toString() {
        return "Formula1: " + super.toString() + "]";
    }
}
