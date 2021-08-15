package paquete1;
/*USO DE MODIFICADORES DE ACCESO
Modificador     Clase   Variable    Metodo     Constructor
 public          Si        Si         Si            Si
 protected       No        Si         Si            Si
 default         Si        Si         Si            Si
 private         No        Si         Si            Si
*/
public class Clase4Private {
    //Atributos
    private String atributoPrivado = "Valor atributo privado";
    
    //Constructores
    private Clase4Private(){
        System.out.println("\nConstructor privado");
    }
    public Clase4Private(String args){
        this();
        System.out.println("Constructor publico usando constructor privado");
        this.metodoPrivado();
    }
    
    //Metodos
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }
    
    //Encapsulamiento

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
}
