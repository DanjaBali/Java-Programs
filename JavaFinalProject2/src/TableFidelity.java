
import java.util.Date;
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
public class TableFidelity extends Table {
    private final int id = 0;
    private double netAmount;
    private double totalAmount;
     private double VAT;
    private List<Item> listOfItems;
    public static int count = 0;
     public int Points = 0;

     public TableFidelity() {
      
    }
        public TableFidelity(final double netAmount, final double totalAmount, final double vAT, final List<Item> listOfItems) {

        super();

        this.netAmount = netAmount;
        this.totalAmount = totalAmount;
        VAT = vAT;
        this.listOfItems = listOfItems;
    }
     
    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
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
     
      public double GetPoints(int points){
      
         double bonus = 0;
         bonus =  points / 10;
         
          return bonus;
      }
     public double GetPoints()
     {    
      double bonus = 0;
      bonus= GetPoints()/10;
      
       return bonus;
     }
    
}
