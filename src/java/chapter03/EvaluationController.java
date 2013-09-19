package chapter03;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author yury
 */
@Named(value = "evaluationController")
@RequestScoped
public class EvaluationController {

    private boolean field1 = true;
    
    public EvaluationController() {
    }
    
    public boolean expr1() {
        return true;
    }
    
    public boolean expr2() {
        return false;
    }

    public boolean isField1() {
        return field1;
    }

    public void setField1(boolean field1) {
        this.field1 = field1;
    }
    
}