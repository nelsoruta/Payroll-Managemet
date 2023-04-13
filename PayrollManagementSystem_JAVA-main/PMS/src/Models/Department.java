/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pazo
 */
@Entity
public class Department implements Serializable {
    @Id
    private String DepartmentNo;
    private String DepName;

    public Department() {
    }

    public Department(String DepartmentNo, String DepName) {
        this.DepartmentNo = DepartmentNo;
        this.DepName = DepName;
    }

    public String getDepartmentNo() {
        return DepartmentNo;
    }

    public void setDepartmentNo(String DepartmentNo) {
        this.DepartmentNo = DepartmentNo;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String DepName) {
        this.DepName = DepName;
    }   
    
}
