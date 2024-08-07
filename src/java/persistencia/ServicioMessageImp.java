
package persistencia;

import negocio.*;


public class ServicioMessageImp implements ServicioMessage{
    private DaoMessage daoMsg;
    
// ya no se crea constructor si no un setter

    public ServicioMessageImp() {
        daoMsg = new DaoMessageImp();
    }
 



    @Override
    public String grabar(String fechaPublicado, String nameUsu, String correoUsu, String message) {
    Message msg =new Message();
    msg.setIdMsg(0);
    msg.setFechaPubl(fechaPublicado);
    msg.setNameUsu(nameUsu);
    msg.setCorreoUsu(correoUsu);
    msg.setMessage(message);
      return daoMsg.grabar(msg);
    }
    
}
