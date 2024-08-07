
package servicio;

import java.sql.Connection;
import negocio.Message;
import persistencia.Conexion;
import persistencia.DaoMessage;
import persistencia.DaoMessageImp;


public class Prueba {

    public static void main(String[] args) {
            System.out.println("********** conexion con la bd **********");    
        // probar si hay conexion con la base de datos
    Connection cn= new Conexion().getConexion();
    if(cn!=null){
        System.out.println("si hay conexion con bd para el portafolio");
    }else{
        System.out.println("no hay conexion con bd ");
    }
        
    ServicioMessageImp dpac= new ServicioMessageImp();
 System.out.println("************ grabar un mensaje ********");  

   //grabar mensaje listo
   Message pac= new Message(0,"10/12/2021","denilson","correo2@gmail.com","este es un comentario de prueba");
   String msg=dpac.grabar("fecha", "nameUsu", "correoUsu", "message");
   System.out.println(msg);
   /*
        ServicioMessageImp sermsg= new ServicioMessageImp();
        String msg= sermsg.grabar("cz", "xz","cxz","cz");
        System.out.println(msg);
        
   
   
     DaoMessage dpac= new DaoMessageImp();
 System.out.println("************ grabar un mensaje ********");  

   //grabar mensaje listo
   Message pac= new Message(0,"10/12/2021","denilson","correo2@gmail.com","este es un comentario de prueba");
   String msg=dpac.grabar(pac);
   System.out.println(msg)
   
   
   
//buscar
    Object[] recep = sermsg.buscar("1");
       if(recep!=null){
       System.out.println(recep[0]+" " +recep[1]+" "+recep[2]);
        
    }else{
        System.out.println("no hay mensajes");
    }
*/
    }
    
}   
