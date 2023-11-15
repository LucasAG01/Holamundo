import java.util.Arrays;

public class TestVoid {
    public static void main(String[] args) {

        //CLASE DIA 24/10/2023


        EjemplosVoid.escribir("kys");

        int numero23=10;
        EjemplosVoid.duplicar(numero23);
        System.out.println("n despues de duplicar su valor "+ numero23);


        int matris[]=new int[100];
        EjemplosVoid.rellenarMatriz(matris);

        System.out.println(Arrays.toString(matris));


        //Matrix positivizar

        int matriz2[][]=new int[5][5];


        //calcular media de 2 numeros
        int o=9,p=8;
        double media = 0;
        media=EjemplosVoid.calcularMedia(45,7);
        System.out.println(media);
        //calcular media de 5 numeros

        int a=8,b=4,c=6,d=3,e=5;


        //Llamar al método que duplica la capacidad de un array

        int m[]={1,3,4};

        m=EjemplosVoid.doblarCapacidadArray(m);

        METODOS1.printar(Arrays.toString(m));  //También cree el EjemplosVoid.escribir();




























    }
}
