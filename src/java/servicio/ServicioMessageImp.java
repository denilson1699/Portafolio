
package servicio;

import java.util.ArrayList;
import java.util.List;
import negocio.*;
import persistencia.*;


public class ServicioMessageImp implements ServicioMessage{
    private DaoMessage daoMsg;
    
// ya no se crea constructor si no un setter
/* con este si funciona la bd
        public ServicioMessageImp() {
        daoMsg = new DaoMessageImp();
    }
 
*/
    public void setDaoMsg(DaoMessage daoMsg) {
        this.daoMsg = daoMsg;
    }


    @Override
    public String grabar(String fechaPublicado, String nameUsu, String correoUsu, String message) {
    Message msg =new Message();
    msg.setIdMsg(0);
    msg.setFechaPubl("xz");
    msg.setNameUsu("xc");
    msg.setCorreoUsu("ds");
    msg.setMessage("ds");
    
      return daoMsg.grabar(msg);
    }

    @Override
    public Object[] buscar(String id) {
       Message msg =daoMsg.buscar(id);
        if(msg!=null){
            Object[] fil= new Object[5];
            fil[0]=msg.getIdMsg();
            fil[1]=msg.getFechaPubl();
            fil[2]=msg.getNameUsu();
            fil[3]=msg.getCorreoUsu();
            fil[4]=msg.getMessage();
            return fil;
        }
        return null;
  }

    @Override
    public List listar() {
    List lis=daoMsg.listar();
        if(lis!=null){
           List lista= new ArrayList();
           for(int i=0;i<lis.size();i++){
                Message msg= (Message)lis.get(i);
                  Object[] fil= new Object[5];
                  fil[0]=msg.getIdMsg();
                  fil[1]=msg.getFechaPubl();
                  fil[2]=msg.getNameUsu();
                  fil[3]=msg.getCorreoUsu();
                  fil[4]=msg.getMessage();
                lista.add(fil);
            }
            
            return lista;
        } 
         return null;
    }

    @Override
    public String comentar(Message message, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List Buscador(String atributo, String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String idMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
