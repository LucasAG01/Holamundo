import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        boolean datos=true;
        do {
            datos = true;
        Scanner intr=new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas: ");
        int horas= intr.nextInt();

        Scanner intr2=new Scanner(System.in);
        System.out.println("Introduzca la tasa: ");
        int tasa=intr2.nextInt();
        float Bruto,Neto;

        int horasExtra;

        horasExtra=horas >38 ? horas-38: 0; //Si las horas trabajadas son más de 38, entonces horasExtra se asigna al valor de las horas trabajadas menos 38

        if(horas<=38){
            Bruto=horas*tasa;

        }

        else{
            Bruto=38*tasa+horasExtra*1.5f*tasa;
        }

        Neto= Bruto <300 ? Bruto : (float)(Bruto*0.9);

        if(Bruto<300){
            Neto=Bruto;
        }
        else{
            Neto=(float) (Bruto*0.9);
        }
        System.out.println("Salario Bruto: "+Bruto);
        System.out.println("Salario neto: "+Neto);
        }while(datos=true);

    }
}
    //Con el do while sigue saliendo para calcular varias cosas sin problema