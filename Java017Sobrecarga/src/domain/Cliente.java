package domain;

import java.util.Date;

public class Cliente extends Persona {

    //Atributos
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contIdCliente;

    //Constructor
    public Cliente(String nombre, int edad, char genero, String direccion,
            Date fechaRegistro, boolean vip) {
        super(nombre, edad, genero, direccion);
        Cliente.contIdCliente++;
        this.idCliente = Cliente.contIdCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    //Metodos
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fecha=").append(this.fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
