/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03;

/**
 *
 * @author yury
 */
public class Employee {

    private String employeeFirst;
    private String employeeLast;
    private String employeeTitle;

    public Employee() {
    }

    public Employee(String employeeFirst, String employeeLast, String employTitle) {
        this.employeeFirst = employeeFirst;
        this.employeeLast = employeeLast;
        this.employeeTitle = employTitle;
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
    
}
