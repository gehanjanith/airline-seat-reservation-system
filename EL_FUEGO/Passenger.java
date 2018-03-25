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
public class Passenger extends Person{

    public Passenger() {
    }

    public Passenger(Name name, Address address, int age, int telephone, String email) {
        super(name, address, age, telephone, email);
    }

    public Passenger(String firstName, String lastName, String street, String city, int age) {
        super(firstName, lastName, street, city, age);
    }
    
    
}
