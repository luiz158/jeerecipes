package chapter03;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "navigationController")
@RequestScoped
public class NavigationController implements java.io.Serializable{
    
    private boolean authenticated = false;

    public NavigationController() {
    }
    
    public String pageOne(){
        return "PAGE_1";
    }
    
    public String pageTwo(){
        return "PAGE_2";
    }
    
    public String nextPage(){
        return "recipe35c";
    }
    
    public void login(){
        setAuthenticated(true);
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
    
}