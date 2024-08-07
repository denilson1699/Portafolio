// proyecto Hotel

package persistencia;
import negocio.*;
import java.util.List;
public interface DaoMessage {
   public String grabar(Message message);
   public Message buscar (String idMsg);
   public String comentar (Message message, String nombre);
   public List listar();
   public List Buscador (String atributo, String cadena);
   public String eliminar (String idMsg);

}
