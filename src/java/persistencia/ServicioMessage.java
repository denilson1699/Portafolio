
package persistencia;

import servicio.*;
import java.util.List;
import negocio.Message;

public interface ServicioMessage {
    public String grabar (String fechaPublicado, String nameUsu, String correoUsu, String message);
    
}
