/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Employee;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pazo
 */
public class EmployeeDAO {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public String SaveEmployee(Employee emp){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.save(emp);
            tx.commit();
            sess.close();
            msg = "Employee Successfully SAVED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public String UpdateEmployee(Employee emp){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.update(emp);
            tx.commit();
            sess.close();
            msg = "Employee Successfully UPDATED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public String DeleteEmployee(Employee emp){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.delete(emp);
            tx.commit();
            sess.close();
            msg = "Employee Successfully DELETED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public List<Employee> findAllEmployees(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query = ss.createQuery("from Employee ORDER BY EmployeeId ASC");
        List<Employee> Employeelist = query.list();
        ss.close();
        return Employeelist;
    }
    
}


