/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EL_FUEGO;

/**
 *
 * @author User
 */
public class Name {
        private String firstName;
        private String lastName;

    public Name() {
        firstName="";
        lastName="";
    }
    
    public Name(String firstName,String lastName ){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastNam() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNam(String lastName) {
        this.lastName = lastName;
    }

    
        @Override
    public String toString() {
        return  "First Name:" + firstName + ", Last Name:" + lastName ;
    }
        
    
}

    
