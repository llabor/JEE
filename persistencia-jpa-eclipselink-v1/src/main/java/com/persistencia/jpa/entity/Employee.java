package com.persistencia.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.Table;

@Entity
//@Table(name = "table_name") especifica nombre tabla en la BD cuando es diferente del de la clase
public class Employee 
{
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY) 
   private int eid;
   //@Column(name = "column_name") cuando tienen distintos nombres: propiedad <> columna
   private String ename;
   private double salary;
   private String deg;
   
   public Employee(int eid, String ename, double salary, String deg) 
   {
      super( );
      this.eid = eid;
      this.ename = ename;
      this.salary = salary;
      this.deg = deg;
   }

   public Employee( ) 
   {
      super();
   }

   public int getEid( ) 
   {
      return eid;
   }
   public void setEid(int eid)  
   {
      this.eid = eid;
   }
   public String getEname( ) 
   {
      return ename;
   }
   public void setEname(String ename) 
   {
      this.ename = ename;
   }

   public double getSalary( ) 
   {
      return salary;
   }
   public void setSalary(double salary) 
   {
      this.salary = salary;
   }

   public String getDeg( ) 
   {
      return deg;
   }
   public void setDeg(String deg) 
   {
      this.deg = deg;
   }
   @Override
   public String toString()
   {
      return "Employee [eid=" + eid + ", ename=" + ename + ", salary="
      + salary + ", deg=" + deg + "]";
   }
}