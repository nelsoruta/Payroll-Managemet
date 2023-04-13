/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Department;
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
public class DepartmentDAO {
    public String SaveDepartment(Department department){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.save(department);
            tx.commit();
            sess.close();
            msg = "Department Successfully SAVED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public String UpdateDepartment(Department department){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.update(department);
            tx.commit();
            sess.close();
            msg = "Department Successfully UPDATED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public String DeleteDepartment(Department department){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.delete(department);
            tx.commit();
            sess.close();
            msg = "Department Successfully DELETED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public List<Department> findAllDepartments(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query = ss.createQuery("from Department ORDER BY DepartmentNo ASC");
        List<Department> departmentlist = query.list();
        ss.close();
        return departmentlist;
    }
    
    public void clearAll(Department Dep){
    Dep.setDepName("");
    }
    
}
