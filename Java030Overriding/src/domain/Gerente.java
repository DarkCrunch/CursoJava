/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author farao
 */
public class Gerente extends Empleado {
    //Atributos
    private String departamento;
    //Constructores
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //overriding
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", departamento: "+this.departamento;
    }
}
