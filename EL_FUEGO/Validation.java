/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EL_FUEGO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author R neelaka
 */

/**
 *Validation class is added to inform empty fields
 * an error message will be give if there are null fields
 */
public class Validation {
    
    public  boolean validate_Email(String input){
        if(input.endsWith(".com")){
            return true;
        }
        JOptionPane.showMessageDialog(null, "Invalid E-mail", "Error", 0);
        return false;
    }
     public boolean vlidateNIC(String input){
         if(input.endsWith("V")|| input.endsWith("v")){
             return true;
         }else if(input.length()==10 ){
             JOptionPane.showMessageDialog(null, "ID number", "Error", 0);
             return true; 
         }
         return false;
     }
     
     public boolean  validate_Telephone( String input){
           if(input.length() != 10){
            JOptionPane.showMessageDialog(null, "Invalid phone number ");
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            char c=input.charAt(i);
            if(!Character.isDigit(c)){
                 JOptionPane.showMessageDialog(null, "Invalid phone number ");
                return false;
            }
        }
        return true;
     }
        public boolean isEmptyField(JTextField field, String err){
        if (field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, (err + " cannot be empty"), "Error", 0);
            field.grabFocus();
            return true;
        }
        return false;
    }
    
}
