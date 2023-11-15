public class coche {

    String matricula;
    float precio;
    int kilometros;

    public coche(){

    }

    public coche(String matricula,float precio){
        this.matricula=matricula;
        this.precio=precio;
    }

    public coche(String matricula,float precio,int kilometros){
        this.matricula=matricula; //Llamada al constructor de la clase object.
        this.precio=precio;
        this.kilometros=kilometros;
    }


    //Source generate contructor ussing Fields. {}


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(this.validarMatricula(matricula)){    //Antes programe el metodo.
            this.matricula=matricula;
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

@Override
    public String toString(){
        return "matricula: "+matricula+",precio: "+precio+" kilometros : "+kilometros;
    }

    private boolean validarMatricula(String matricula){
        boolean correcto=true;
        if(matricula.length()==7){
            for(int i=0;i<4;i++){
                if(!Character.isDigit(matricula.charAt(i))){ //Si no hay 1 digito en los 4 primeros
                    correcto=false;
                    break;
                }                                                                       //He pegado lo de arriba  de set matricula.
            }
            for(int i=4;i<7;i++){ //las ultimos digitos
                if(!Character.isLetter(matricula.charAt(i))){  //Si no hay letra
                    correcto=false;
                    break;
                }
            }
        }
        return correcto;
    }





}
