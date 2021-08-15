package test;

import java.sql.*;

public class TestMySQLJDBC {

    /*
    jdbc:mysql://host:port/database?user=name_user&password=secret_password

    En donde:
        *host: es la IP donde está la base de datos MySQL, si está en 
         nuestra misma máquina será localhost.
        *port: es el puerto por donde escucha el servidor de base de 
         datos, por defecto para MySQL es el 3306.
        *database: es el nombre de la base de datos a la cual nos 
         queremos conectar.
        *user: es el usuario de la base de datos
        *password: es la clave con que el usuario puede ingresar a 
         la base de datos
     */
    public static void main(String[] args) {
        //Primer paso es escribir la cadena de conexion
        var baseDeDatos = "test";
        var usuario = "root";
        var contrasena = "admin";
        var conexionSegura = "useSSL=" + false;
        var tiempoZona = "useTimezone=" + true;
        var tiempoZonaServer = "serverTimezone=UTC";
        var permitirPublicKey = "allowPublicKeyRetrieval=" + true;
        var driver = "com.mysql.cj.jdbc.Driver";
        var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
        var url = "jdbc:mysql://localhost:3306/"
                + baseDeDatos + "?"//(?)simbolo de cierre
                + conexionSegura + "&"//(&)añadir otro parametro
                + tiempoZona + "&"
                + tiempoZonaServer + "&"
                + permitirPublicKey;
        try {
            //Class.forName(driver);//en app webs se necesitan, en locales no
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            Statement instruccion = conexion.createStatement();
            ResultSet resultado = instruccion.executeQuery(sql);
            System.out.println("id_persona\tnombre         \tapellido       \temail          \ttelefono");
            System.out.println("__________\t_______________\t_______________\t_______________\t________");
            while (resultado.next()) {
                String idpersona = String.format("%9s", resultado.getInt("id_persona"));
                String nombre_p = String.format("%15s", resultado.getString("nombre"));
                String apellido_p = String.format("%15s", resultado.getString("apellido"));
                String email_p = String.format("%15s", resultado.getString("email"));
                String telefono_p = String.format("%15s", resultado.getInt("telefono"));
                System.out.println(idpersona + "\t"
                        + nombre_p + "\t"
                        + apellido_p + "\t"
                        + email_p + "\t"
                        + telefono_p);
            }
            System.out.println("__________\t_______________\t_______________\t_______________\t________");
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
