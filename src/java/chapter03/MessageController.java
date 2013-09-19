package chapter03;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author yury
 */
@Named(value = "messageController")
@SessionScoped
public class MessageController implements Serializable {

    int hitCounter = 0;
    private String javaText;

    public MessageController() {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Managed Bean Initialized ", null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public void newMessage() {
        String hitMessage = null;
        hitCounter++;
        if (hitCounter > 1) {
            hitMessage = hitCounter + " times";
        } else {
            hitMessage = hitCounter + " time";
        }
        Date currDate = new Date();
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "You've pressed that button " + hitMessage + "! The current date and time: " + currDate, null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        if (getJavaText().equalsIgnoreCase("java")) {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Good Job, that is the correct text!", null);
            FacesContext.getCurrentInstance().addMessage("componentForm:javaText", javaTextMsg);
        } else {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sorry, that is NOT the correct text!", null);
            FacesContext.getCurrentInstance().addMessage("componentForm:javaText", javaTextMsg);
        }
    }

    public String getJavaText() {
        return javaText;
    }

    public void setJavaText(String javaText) {
        this.javaText = javaText;
    }
    
}
