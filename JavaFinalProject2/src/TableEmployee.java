
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danja Bali UNYT
 */
public class TableEmployee extends Table {
      private final int id = 0;
   private double netAmount;  
   private double totalAmount;    
   private double VAT;
   private List<Item> listOfItems;
   public static int count = 0;
   private double NumberOfTimesServed;
   
     public TableEmployee() {
      
    }
        public TableEmployee(final double netAmount, final double totalAmount, final double vAT, final List<Item> listOfItems,final double NumberOfTimesServed) {

        super();

        this.netAmount = netAmount;
        this.totalAmount = totalAmount;
        VAT = vAT;
        this.listOfItems = listOfItems;
        this.NumberOfTimesServed = NumberOfTimesServed;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public double getNumberOfTimesServed() {
        return NumberOfTimesServed;
    }

    public void setNumberOfTimesServed(double NumberOfTimesServed) {
        this.NumberOfTimesServed = NumberOfTimesServed;
    }
        
        public double Amount(double amount){
        double bonus = 0;
        bonus = amount/ 10;
        return bonus;
        }
        
         public double Amount(){
         double bonus = 0;
        bonus = Amount()/ 10;
        return bonus;
         }
        
}
