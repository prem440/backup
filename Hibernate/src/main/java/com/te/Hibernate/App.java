package com.te.Hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("employees");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
   Employee emp=new Employee();
 Address adr=new Address();
// et.begin();
// adr.setSurvey_no(201);
// adr.setHouse_name("m1-c2");
// adr.setCity("bengaluru");
// adr.setLandmark("near ayyangar bakery");
// adr.setPincode(423567);
//em.persist(adr);
//et.commit();
 Address ref = em.getReference(Address.class,201);
 System.out.println("survey no is"+ref.getSurvey_no()+" city :-"+
ref.getCity()+" house name is"+
 ref.getHouse_name()+"landmark is"+
  ref.getLandmark()+"pincode is :"+
 ref.getPincode());
 
 List<Employee> l1=new ArrayList<>();
 
 em.

//    emp.setId(127);
//    emp.setName("raj");
//    emp.setSalary(423643);
//    emp.setDesignation("software Engineer");
//    et.begin();
//    em.persist(emp);
//    et.commit();
//    emp.setId(124);
//    emp.setName("ravee");
//    emp.setSalary(32221);
//    emp.setDesignation("s software Engineer");
//    et.begin();
//    em.persist(emp);
//    et.commit();
//    et.begin();
//    Employee find = em.find(Employee.class,123);
//    em.remove(find);
//    Employee find2 = em.find(Employee.class,125);
//    find2.setDesignation("manager");
//    
//    System.out.println("remove data successfully");
//    et.commit();
    
    }
}