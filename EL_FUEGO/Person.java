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
public class Person {
    private Name name;
    private Address address;
    private int age;
    private int telephone;
    private String email;
    
    public Person(){
        telephone = 000000000;
        email = null;
        age=0;
        name=new Name();
        address= new Address();
    }
    public Person(Name name, Address address, int age,int telephone, String email){
        this.name=name;
        this.address=address;
        this.age=age;
        this.telephone = telephone;
        this.email = email;
    }
    public Person(String firstName, String lastName, String street, String city, int age){
        name= new Name(firstName, lastName);
        address= new Address(street, city);
        this.age=age;
        this.telephone = telephone;
        this.email = email;
    }
    public void setName(Name name){
        this.name=name;
    }
    public void setAddress(Address address){
        this.address=address;
    }
    
    public void setAge(int age){
        this.age=age;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Name getName(){
        
        return name;
    }
    
    public Address getAddress(){
        
        return address;
    }
    
    public int getAge(){
        
        return age;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
   
    @Override
    public String toString() {
        return "Name-" + name + " Address-" + address + " Age-" + age+" tel-"+telephone+" email-"+email;
    }
    
    
}
