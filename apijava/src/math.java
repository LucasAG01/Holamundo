import javax.swing.*;

public class math {
    public static void main(String[] args) {
       //Clase Math: métodos matemáticos
       //Calcular la raiz: Math.sqrt(numero)
       int numero=23;
       float raiz=(float) Math.sqrt(23);

       //Calcualar potencias: Math.pow(base,exponente)
        int numero2=3;
        int potencia5= (int)Math.pow(numero2,5);

        //Redondear valores:
        float valor1=4.6f;
        int valor1enteroPequenho=(int)Math.floor(valor1);
        int valor1EnteroGrande= (int)Math.ceil(valor1);
        int valor1EnteroCercano= Math.round(valor1);

        System.out.println("valor1enteropequenho: " +valor1enteroPequenho);
        System.out.println("valorenteroGrande: "+valor1EnteroGrande);
        System.out.println("valorenterocercano: "+valor1EnteroCercano);






    }
}