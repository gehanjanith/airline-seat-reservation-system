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
public class Seat {
    private int rowNumber;
    private char colomunCharacter;
    private boolean bookOrNot;

    public Seat() {
        
    }
   
    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setColomunCharacter(char colomunCharacter) {
        this.colomunCharacter = colomunCharacter;
    }

    public void setBookOrNot(boolean bookOrNot) {
        this.bookOrNot = bookOrNot;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public char getColomunCharacter() {
        return colomunCharacter;
    }

    public boolean isBookOrNot() {
        return bookOrNot;
    }

    @Override
    public String toString() {
        return ""+rowNumber+colomunCharacter;
    }
    
    
    
    
}
