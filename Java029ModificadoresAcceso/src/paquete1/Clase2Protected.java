package paquete1;
/*USO DE MODIFICADORES DE ACCESO
Modificador     Clase   Variable    Metodo     Constructor
 public          Si        Si         Si            Si
 protected       No        Si         Si            Si
 default         Si        Si         Si            Si
 private         No        Si         Si            Si
*/
public class Clase2Protected {
    //Atributos
    protected String atributoProtected = "Valor atributo protected";
    
    //Constructores
    protected Clase2Protected(){
        System.out.println("\nConstructor protected");
    }
    public Clase2Protected(String arg){
        this();
        System.out.println("Constructor publico usando el constructor protected");
    }
    //Metodos
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
