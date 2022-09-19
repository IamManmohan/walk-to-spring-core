package org.spring.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String employeeName;
    private List<String> employeePhoneNumber;
    private Set<String> employeeAddress;
    private Map<String, String> course;

    public Employee() {
        super();
    }

    public Employee(String employeeName, List<String> employeePhoneNumber, Set<String> employeeAddress, Map<String, String> course) {
        this.employeeName = employeeName;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeAddress = employeeAddress;
        this.course = course;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(List<String> employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public Set<String> getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Set<String> employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeePhoneNumber=" + employeePhoneNumber +
                ", employeeAddress=" + employeeAddress +
                ", course=" + course +
                '}';
    }
}
