
package servicio;

import java.util.List;
import negocio.Message;

public interface ServicioMessage {
    public String grabar (String fechaPublicado, String nameUsu, String correoUsu, String message);
    public Object []buscar (String idMsg);
   public String comentar (Message message, String nombre);
    public List listar();
   public List Buscador (String atributo, String cadena);
   public String eliminar (String idMsg);
    
}
