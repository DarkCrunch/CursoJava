/*
DAO = Data Access Object
cada clada DAO esta asociada a una clase entidad, en este caso seria Persona
 */
package datos;
import java.util.*;
import java.sql.*;
import domain.Persona;
public class PersonaDAO {
    //Atributos
    private static final String SQL_SELECT="SELECT "
            + "id_persona, nombre, apellido, email, telefono "
            + "FROM persona";
    public List<Persona> seleccionar(){
        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
    }
}
