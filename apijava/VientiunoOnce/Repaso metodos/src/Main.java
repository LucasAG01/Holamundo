import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int minimo=metodos.minimo(4,3,6);
        System.out.println("Minicomo comun multi0plo: "+minimo);

        int maximo=metodos.mcd(120,180,440);
        System.out.println("Maximo: "+maximo);

        int fax=metodos.facotrial(8);
        System.out.println("factotial: "+fax);




        Scanner intr=new Scanner(System.in);
        System.out.println("Introduzca m: ");
        int eme= intr.nextInt();
        System.out.println("Introduzca n: ");
        int ene= intr.nextInt();

        int undel=eme-ene;
        int up=(metodos.factorial1(eme)/(metodos.factorial1(ene)*(metodos.factorial1(undel))));

        System.out.println("Factorial: "+up);












    }
}