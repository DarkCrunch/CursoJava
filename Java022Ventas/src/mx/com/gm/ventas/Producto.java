/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas;

/**
 *
 * @author farao
 */
public class Producto {

    //Atributos
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructores
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        //llama al constructor privado
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    //Encapsulamiento
    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodos

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + this.idProducto + ", nombre=" 
                + this.nombre + ", precio=" + this.precio + '}';
    }
}
