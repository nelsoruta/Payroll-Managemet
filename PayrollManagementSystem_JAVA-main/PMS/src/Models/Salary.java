/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pazo
 */
@Entity
public class Salary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int salaryId;
    private int bonus;
    private int TA;
    private int WA;
    private int employeeId;

    public Salary() {
    }

    public Salary(int salaryId, int bonus, int TA, int WA, int employeeId) {
        this.salaryId = salaryId;
        this.bonus = bonus;
        this.TA = TA;
        this.WA = WA;
        this.employeeId = employeeId;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTA() {
        return TA;
    }

    public void setTA(int TA) {
        this.TA = TA;
    }

    public int getWA() {
        return WA;
    }

    public void setWA(int WA) {
        this.WA = WA;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    
}
