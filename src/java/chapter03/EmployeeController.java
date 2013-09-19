/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author yury
 */
@Named(value = "employeeController")
@SessionScoped
public class EmployeeController implements Serializable {
    
    private String employeeFirst;
    private String employeeLast;
    private String employeeTitle;
    private List<Employee> employeeList = new ArrayList<>();
    
    public EmployeeController() {
    }
    
    public void insertEmployee() {
        Employee employee = new Employee(employeeFirst, employeeLast, employeeTitle);
        employeeList.add(employee);
        
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Employee Successfully Added", null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public String getEmployeeFirst() {
        return employeeFirst;
    }

    public void setEmployeeFirst(String employeeFirst) {
        this.employeeFirst = employeeFirst;
    }
    
    public String getEmployeeLast() {
        return employeeLast;
    }

    public void setEmployeeLast(String employeeLast) {
        this.employeeLast = employeeLast;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }
    
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
}
