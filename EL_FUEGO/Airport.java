/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EL_FUEGO;

/**
 *
 * @author CHARITH
 */
public class Airport {
    
    
    private String ID;
    private String city;
    private String country;

    public Airport() {
    }

    public Airport(String ID, String city, String country) {
        this.ID = ID;
        this.city = city;
        this.country = country;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    

    @Override
    public String toString() {
        return "Airport{" + "ID=" + ID + ", city=" + city + ", country=" + country + '}';
    }

    
    
    
}
