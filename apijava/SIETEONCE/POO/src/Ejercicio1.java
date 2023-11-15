public class Ejercicio1 {
    public static void main(String[] args) {

        jugador jugador1 = new jugador("A1", "Pedro");
        jugador jugador2 = new jugador("B2", "Juan");
        jugador jugador3 = new jugador("C3", "María");


        System.out.println("Jugador1: "+jugador1);
        System.out.println("Jugador2: "+jugador2);
        System.out.println("Juadador3: "+jugador3);

        jugador1.setCodigo("A2");
        jugador2.setNombre("Pepe");
        jugador3.actualizarPuntos(10);

        System.out.println("Jugador 1: " + jugador1);
        System.out.println("Jugador 2: " + jugador2);
        System.out.println("Jugador 3: " + jugador3);



























    }
}
