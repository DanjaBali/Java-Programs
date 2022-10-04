/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danja Bali UNYT
 */
public class SimpleCustomer extends Customer {
    public SimpleCustomer (String name, String surname, String address, String phoneNumber) {
	super(name, surname, address, phoneNumber);
    }
    
    public double getTotalDiscount(){
        return 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + " / Type: Simple Costumer";
    }
    
    @Override
    public String printInfo(){
        return toString();
    }
}
    