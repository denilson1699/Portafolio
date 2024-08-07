
package negocio;


public class Message {
    private int idMsg;
    private String fechaPubl,nameUsu,correoUsu,message;

    public Message(int idMsg, String fechaPubl, String nameUsu, String correoUsu, String message) {
        this.idMsg = idMsg;
        this.fechaPubl = fechaPubl;
        this.nameUsu = nameUsu;
        this.correoUsu = correoUsu;
        this.message = message;
    }
   

    public Message() {
    }

 
    public String getFechaPubl() {
        return fechaPubl;
    }

    public void setFechaPubl(String fechaPubl) {
        this.fechaPubl = fechaPubl;
    }

    public String getNameUsu() {
        return nameUsu;
    }

    public void setNameUsu(String nameUsu) {
        this.nameUsu = nameUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIdMsg() {
        return idMsg;
    }

    public void setIdMsg(int idMsg) {
        this.idMsg = idMsg;
    }
    
    
    
    
}
