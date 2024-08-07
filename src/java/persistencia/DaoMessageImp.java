    // proyecto Hotel
package persistencia;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocio.*;
public class DaoMessageImp implements DaoMessage{


    @Override
    public String grabar(Message message) {
       String sql="insert into message values("+message.getIdMsg()+",'"+message.getFechaPubl()+"','"+message.getNameUsu()+"','"+message.getCorreoUsu()+"','"+message.getMessage()+"')"; 
       return Operacion.ejecutar(sql);
    }

    @Override
    public Message buscar(String idMsg) {
    String sql="select *from message where ID_Message='"+idMsg+"'"; 
    Object[] fila=Operacion.buscar(sql);
    if(fila!=null){
        Message msg=new Message();
        msg.setIdMsg((int) fila[0]);
        msg.setFechaPubl(fila[1].toString());
        msg.setNameUsu(fila[2].toString());
        msg.setCorreoUsu(fila[3].toString());
        msg.setMessage(fila[4].toString());
        return msg;
    }
    return null;
    }
    // recuperar la fecha del sistema
    private String getFecha(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); 
        return sdf.format(new Date());
    }
    
    @Override
    public String comentar(Message message,String nombre) {
    String msg="no existe datos del comentario id "+String.valueOf(message.getIdMsg());
    DaoMessage dMSG= new DaoMessageImp();
    Message mensaje= new Message();
    mensaje=dMSG.buscar(String.valueOf(message.getIdMsg()));
    if(mensaje!=null){
    String comentario=mensaje.getMessage()+"\n\n "+getFecha()+" "+nombre+": \n "+message;
    String sql="update message set Message='"+comentario+"' where ID_Message='"+message.getIdMsg()+"'"; 
    msg=Operacion.ejecutar(sql);
    return msg; 
    }
        return msg;
    }
  
    @Override
    public List listar() {
      List lis=new ArrayList();
      String sql="select *from message";
      List lista=Operacion.listar(sql);
      if(lista!=null){
          for(int i=1;i<lista.size();i++){
              Object[] fila= new Object[5];
              fila=(Object[])lista.get(i);
              Message msg= new Message();
                  msg.setIdMsg((int) fila[0]);
                  msg.setFechaPubl(fila[1].toString());
                  msg.setNameUsu(fila[2].toString());
                  msg.setCorreoUsu(fila[3].toString());
                  msg.setMessage(fila[4].toString());
              lis.add(msg);
          }
          return lis;
      }
    return null; 
    }

    @Override
    public List Buscador (String atributo, String cadena) {
       List lis=new ArrayList();
       String _string= atributo+" like '%"+cadena+"%'";
       String sql="select *from message where "+_string.toString();
               // like % "+"'"+cadena+"'"+"%ss";
       List lista=Operacion.listar(sql);
          if(lista!=null){
              for(int i=1;i<lista.size();i++){
                  Object[] fila=(Object[])lista.get(i);
                  Message msg= new Message();
                  msg.setIdMsg((int) fila[0]);
                  msg.setFechaPubl(fila[1].toString());
                  msg.setNameUsu(fila[2].toString());
                  msg.setCorreoUsu(fila[3].toString());
                  msg.setMessage(fila[4].toString());
                  lis.add(msg);
              }
              return lis;
          }
        return null;
    }

    @Override
    public String eliminar(String  idMsg) {
    String msg="no existe datos del comentario con ID "+idMsg;
    DaoMessage daoMsg= new DaoMessageImp();
    Message mensaje= new Message();
    mensaje=daoMsg.buscar(String.valueOf(idMsg));
    if(mensaje!=null){
        String sql="delete from message where ID_Message= '"+idMsg+"'"; 
        msg=Operacion.ejecutar(sql);
        return msg; 
    }
    return msg;
    }
    
}
