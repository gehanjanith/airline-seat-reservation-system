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
public class Reservation {
    
     private int reservationNumber;
    private Passenger passanger;
    private Flight flight;
   
  
    public void cancelReservation(){
        
    }

    public Reservation(int reservationNumber, Passenger passanger, Flight flight) {
        this.reservationNumber = reservationNumber;
        this.passanger = passanger;
        this.flight = flight;
    }
    
    
    
}
