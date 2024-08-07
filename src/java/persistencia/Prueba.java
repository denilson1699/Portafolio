// proyecto hotel
package persistencia;

import java.sql.*;
import java.util.List;
import negocio.*;

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
    
 /*  
    System.out.println("*********** ejecutar consulta sql *********");        
   
    // enviar una consulta a la base de datoss 
    String sql="insert into message values(0,'especil','apellidos 2','teraupeuta','correo@gmail.com')";
    String msg=Operacion.ejecutar(sql);
    System.out.println(msg);
   */
 
   DaoMessage dpac= new DaoMessageImp();
 System.out.println("************ grabar un mensaje desde daoimplementado ********");  

   //grabar mensaje listo
   Message pac= new Message(0,"10/12/2021","denilson","correo2@gmail.com","este es un comentario de prueba");
   String msg=dpac.grabar(pac);
   System.out.println(msg);
   
   
 System.out.println("************ grabar un mensaje desde servicioImplementado ********");  

   ServicioMessage dpac2= new ServicioMessageImp();
   //grabar mensaje listo
   String msg2=dpac2.grabar("10/12/2021","denilson","correo2@gmail.com","este es un comentario de prueba");
   System.out.println(msg2);
   
      /*
   
    System.out.println("************ buscar un paciente ********");  
   //buscar paciente listo
    pac = dpac.buscar("6");
       if(pac!=null){
       System.out.println("-"+pac.getIdMsg()+" " +pac.getFechaPubl()+" " +pac.getMessage());
       }else{
        System.out.println("no exite comentario");
       }
       
       
       
       System.out.println("************ buscar un con like ********");  
    List lista1 =dpac.Buscador("NameUsu","sad");
       if(lista1!=null){
           for(int i=0;i<lista1.size();i++){
               Message esp3= (Message)lista1.get(i);
            System.out.println(esp3.getIdMsg()+" "+esp3.getFechaPubl()+" "+esp3.getMessage());
           }
       }else{
          System.out.println("no hay lista");   
       }   
    System.out.println("************ comentar un mensaje ********");  
    Message pac2= new Message(5,"","","","dependiente correo2@gmail.com");
    String msg3=dpac.comentar(pac2,"denilon");
    System.out.println(msg3);   
 */
      
     System.out.println("************ eliminar mensaje  ********");  
    String lmsg =dpac.eliminar("1");
        System.out.println(lmsg);   
       
}
    }
