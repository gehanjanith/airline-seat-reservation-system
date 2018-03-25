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
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javafx.scene.chart.PieChart;

public class Flight {
    
private String flightNumber;
    private Calendar departureDate;
    private Airport departureAirport;
    private Airport designationAirport;
    private Time departureTime;
    private Time arrivalTime;
    private Vector<FlightSection> flightSections;

    public Flight() {
        

    }

    public Flight(String flightNumber, Calendar departureDate, Airport departureAirport, Airport designationAirport, Time departureTime, Time arrivalTime, Vector<FlightSection> flightSections) {
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureAirport = departureAirport;
        this.designationAirport = designationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightSections = flightSections;
    }

    public void setFlightSections(Vector<FlightSection> flightSections) {
        this.flightSections = flightSections;
    }

    
    

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureDate(Calendar departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDesignationAirport(Airport designationAirport) {
        this.designationAirport = designationAirport;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Calendar getDepartureDate() {
        return departureDate;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getDesignationAirport() {
        return designationAirport;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }
    

    @Override
    public String toString() {
        return "Flight{" + "flightNumber=" + flightNumber + ", departureDate=" + departureDate + ", departureAirport=" + departureAirport + ", designationAirport=" + designationAirport + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + '}';
    }

    
}

