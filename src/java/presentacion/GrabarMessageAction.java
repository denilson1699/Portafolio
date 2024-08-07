
package presentacion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import servicio.*;

public class GrabarMessageAction extends org.apache.struts.action.Action {
    private ServicioMessage serMsg;
// agremanos un setter en ves de un constructor para utilizar el frameword spring

    public void setSerMsg(ServicioMessage serMsg) {
        this.serMsg = serMsg;
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        GrabarMessageForm x=(GrabarMessageForm) form;
        String msg=serMsg.grabar(x.getFechaPubl(), x.getNameUsu(), x.getCorreoUsu(), x.getMessage()); 
        request.getSession().setAttribute("msg", msg);
        return mapping.findForward("mensaje");
        
    }
}