/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EL_FUEGO;

/**
 *
 * @author Gehan
 */
public class Address {
     public String street;
    public String city;

    public Address() {
    }
    
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

     @Override
    public String toString() {
        return "Street:" + street + " City:" + city ;
    }

    
   
    
}
