package paquete1;
/*USO DE MODIFICADORES DE ACCESO
Modificador     Clase   Variable    Metodo     Constructor
 public          Si        Si         Si            Si
 protected       No        Si         Si            Si
 default         Si        Si         Si            Si
 private         No        Si         Si            Si
*/
class Clase3Default {
    //Puede conocerse como default o tambien como package
    //Atributos
    String atributoDefault = "Valor atributo default";
    
    //Constructores
    Clase3Default(){
        System.out.println("Constructor default");
    }
    
    //Metodos
    void metodoDefault(){
        System.out.println("Metodo default");
    }
}
