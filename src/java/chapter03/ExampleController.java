package chapter03;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "exampleController")
@RequestScoped
public class ExampleController {

    private String exampleProperty;

    public ExampleController() {
        exampleProperty = "Used to instantiate the bean.";
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, ResourceBundle.getBundle("/recipes/chapter03/Bundle").getString("ExampleMessage"), null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public String getExampleProperty() {
        return exampleProperty;
    }

    public void setExampleProperty(String exampleProperty) {
        this.exampleProperty = exampleProperty;
    }
}
