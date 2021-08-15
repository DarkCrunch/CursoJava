package paquete1;
/*USO DE MODIFICADORES DE ACCESO
Modificador     Clase   Variable    Metodo     Constructor
 public          Si        Si         Si            Si
 protected       No        Si         Si            Si
 default         Si        Si         Si            Si
 private         No        Si         Si            Si
*/
public class Clase1Public {
    //Atributos
    public String atributoPublico = "Valor atributo publico";
    
    //Constructores
    public Clase1Public(){
        System.out.println("Constructor publico");
    }
    
    //Metodos
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
}
