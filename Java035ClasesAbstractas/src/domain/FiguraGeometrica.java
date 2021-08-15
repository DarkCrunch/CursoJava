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
public abstract class FiguraGeometrica {

    //Atributos
    private String tipoFigura;

    //Constructores
    protected FiguraGeometrica(String tipoFigura) {
        this.setTipoFigura(tipoFigura);
    }

    //Encapsulamiento
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //Metodos
    public abstract void dibujar();

    @Override
    public String toString() {
        return "FiguraGeometrica{" 
                + "tipoFigura=" + this.getTipoFigura() + '}';
    }
    

}
