/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author socamporomani
 */
public class empleadoBuilder {
   private String lastName;
   private String middleName;
   private String firstName;
   private long id;
   private int birthYear;
   private int birthMonth;
   private int birthDate;
   private int hireYear;
   private int hireMonth;
   private int hireDate;
   
   public empleadoBuilder(){
       
   }
   public empleadoBuilder(long id, String firstName){
       this.id=id;
       this.firstName=firstName;
   }

    public empleadoBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public empleadoBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public empleadoBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public empleadoBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public empleadoBuilder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public empleadoBuilder setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public empleadoBuilder setBirthDate(int birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public empleadoBuilder setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }

    public empleadoBuilder setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
        return this;
    }

    public empleadoBuilder setHireDate(int hireDate) {
        this.hireDate = hireDate;
        return this;
    }
    public Employee createEmpleado(){
        return new Employee(lastName, middleName, firstName, id, birthYear, birthMonth, birthDate, hireYear, hireMonth, hireDate);
    }
   
}
